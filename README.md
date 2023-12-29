 # سوال 1
در نسخه اولیه برنامه تابع temp() بیشترین میزان استفاده از حافظه و CPU را به خود اختصاص میدهد 
 <br>
میزان استفاده از حافظه در عکس زیر مشخص است 
 <br>
 ![Alt text](https://github.com/HamedMajdi/Java-Profiling-with-YourKit/blob/master/Memory%20-%20Before%20temp%20method%20.png)
<br>
 <br>
 ![Alt text](https://github.com/HamedMajdi/Java-Profiling-with-YourKit/blob/master/Memory%20-%20After%20temp%20method.png)
<br>
<br>
همچنین میزان استفاده از CPU نیز به شکل زیر تغییر میکند:
 ![Alt text](https://github.com/HamedMajdi/Java-Profiling-with-YourKit/blob/master/CPU%20-%20Before%20temp%20method%20.png)
 ![Alt text](https://github.com/HamedMajdi/Java-Profiling-with-YourKit/blob/master/CPU%20-%20After%20temp%20method.png)
<br><br>
## راه حل اول:
با توجه به اینکه وجود تابع temp() هیچ تفاوتی در منطق برنامه اجرا نمیکند، بهترین راه حل حذف کلی این تابع است<br>
## راه حل دوم:
 در این روش به راحتی میتوان به جای استفاده از ArrayList<Integer> از آرایه int[] استفاده کرد. این روش میزان استفاده از منابع بسیار کمتری نسبت به ArrayList<Integer> دارد<br>
 

## راه حل سوم:
 به جای ذخیره کلیه موارد i+j میتوان آنرا داخل یک متغیر long ذخیره کرد

 در این عکس میتوان میزان نصرف حافظه و پردازنده را پس از بهینه سازی تابع temp مشاهده کرد<br><br>

 ![Alt text](https://github.com/HamedMajdi/Java-Profiling-with-YourKit/blob/master/CPU%20-%20After%20Optimization.png)<br>
 ![Alt text](https://github.com/HamedMajdi/Java-Profiling-with-YourKit/blob/master/Memory%20-%20After%20Optimization.png)<br><br>
# سوال 2
در این سوال از تابع فیبوناچی استفاده گردید
در حالت اول برنامه از یک تابع بازگشتی استفاده میکند که به هیچ عنوان برای اعداد بزرگ مناسب نمیباشد.
میزان مصرف CPU در تصاویر زیر گویاست:
![Alt text](https://github.com/HamedMajdi/Java-Profiling-with-YourKit/blob/master/Fibonacci%20.png)<br><br>

## روش بهینه
در این روش به جای استفاده از توابع بازگشتی از توابع تکرار شونده استفاده گردید. در نسخه دوم، متد fibonacci() از یک حلقه استفاده می‌کند تا اعداد فیبوناچی را محاسبه کند، که از هزینه تماس‌های بازگشتی و خطر سرریز پشته جلوگیری می‌کند. این عمل باعث افزایش کارایی برای ورودی‌های بزرگتر می‌شود.<br><br>

![Alt text](https://github.com/HamedMajdi/Java-Profiling-with-YourKit/blob/master/Fibonacci%20%20Optimized.png)<br><br>
