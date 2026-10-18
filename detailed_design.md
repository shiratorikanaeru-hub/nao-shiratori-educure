# 注文処理システム 詳細設計書

## 1. クラス設計定義

### OrderService

- フィールド
  - `paymentService: PaymentService` — 決済処理を行うサービス（DI注入）
  - `orderRepository: OrderRepository` — 注文データの保存・検索を行うリポジトリ（DI注入）
- メソッド
  - `placeOrder(userId: Long, amount: int): boolean` — 注文を処理し、完了結果を返す

### PaymentService

- メソッド
  - `process(amount: int): boolean` — 指定金額の決済を実行し、決済結果を返す

### OrderRepository

- メソッド
  - `save(order: Order): Order` — 注文をデータベースに保存し、保存後の注文を返す
  - `findById(id: Long): Optional<Order>` — 注文IDで注文を検索する

## 2. 注文処理のシーケンス

ユーザーが注文する際の処理フローを、呼び出し順に示す。

1. **ユーザー → OrderService**: `placeOrder(userId, amount)` を呼び出す。
2. **OrderService → PaymentService**: `process(amount)` を呼び出し、決済を実行する。
3. **PaymentService → OrderService**: 決済結果（`true` または `false`）を返す。
4. **OrderService**: 決済結果を確認する。決済失敗（`false`）の場合は注文処理を終了し、`false` を返す。決済成功（`true`）の場合は注文を生成する。
5. **OrderService → OrderRepository**: `save(order)` を呼び出し、注文を保存する。
6. **OrderRepository → OrderService**: 保存済みの `Order` を返す。
7. **OrderService → ユーザー**: 注文完了を示す `true` を返す。

### シーケンス図

```mermaid
sequenceDiagram
    actor User as ユーザー
    participant OS as OrderService
    participant PS as PaymentService
    participant OR as OrderRepository

    User->>OS: placeOrder(userId, amount)
    OS->>PS: process(amount)
    PS-->>OS: paymentResult
    alt 決済成功
        OS->>OR: save(order)
        OR-->>OS: savedOrder
        OS-->>User: true（注文完了）
    else 決済失敗
        OS-->>User: false（注文失敗）
    end
    