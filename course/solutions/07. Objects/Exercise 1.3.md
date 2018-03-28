[[Back to the questions]](../../07.%20Objects.md#exercise-1)

## 7. Objects - Solution to exercise 1.3

```scala
object PriceCalculator {
  val taxRate = 0.20

  def tax(price: Double) = price * taxRate
  
  def priceTaxIncluded(price: Double) = price + tax(price)
}
```
