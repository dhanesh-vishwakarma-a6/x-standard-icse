package series;

/*
 * Design a class to overload a function sumSeries() as follows:

(i) void sumSeries(int n, double x): with one integer argument and one double argument to find and display the sum of the series given below:

𝑠
=
𝑥
1
−
𝑥
2
+
𝑥
3
−
𝑥
4
+
𝑥
5
.
.
.
 
.
.
.
 
.
.
.
 
𝑡
𝑜
 
𝑛
 
𝑡
𝑒
𝑟
𝑚
𝑠
s= 
1
x
​
 − 
2
x
​
 + 
3
x
​
 − 
4
x
​
 + 
5
x
​
 ... ... ... to n terms

(ii) void sumSeries(): to find and display the sum of the following series:

𝑠
=
1
+
(
1
×
2
)
+
(
1
×
2
×
3
)
+
.
.
.
 
.
.
.
 
.
.
.
 
+
(
1
×
2
×
3
×
4...
 
.
.
.
 
.
.
.
 
×
20
)
s=1+(1×2)+(1×2×3)+... ... ... +(1×2×3×4... ... ... ×20)

Answer: 1.23333333333333332
Answer: 2561327494111820313
 */

 public class SumSeries
 {
     void sumSeries(int n, double x) {
         double sum = 0;
         for (int i = 1; i <= n; i++) {
             double t = x / i;
             if (i % 2 == 0)
                 sum -= t;
             else
                 sum += t;
         }
         System.out.println("Sum = " + sum);
     }
     
     void sumSeries() {
         long sum = 0, term = 1;
         for (int i = 1; i <= 20; i++) {
             term *= i;
             sum += term;
         }
         System.out.println("Sum=" + sum);
     }
 }
