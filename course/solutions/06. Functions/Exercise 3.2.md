[[Back to the questions]](../../06. Functions.md#exercise-3)

## 6. Functions - Solution to exercise 3.2

```scala
def receipt(price: Double, taxCalculator: Double => Double) =
  "Subtotal: " + price + " Total: " + taxCalculator(price)
```
