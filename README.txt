1) 	Computer Architecture: 
	2011 MacBook Pro
	2.4 GHz Intel Core i5
	osx 10.9.2
2) I used the following command line, line of code to get the output
	java ManyThreads | uniq | wc -l
it gets the amount of uniq elements and counts the number of lines. Unfortunately, you have to subtract 1 from the number given to get the amount of switches because the command line counts the first line, which it shouldn’t do.

3) ManyThreads.java: 100 * 125.97 / 1119 = about 11.25%
   ManyThreadsYield.java: 100 * 4784.21 / 72254.3 = about 6.6%

Differences:
I noticed that the OS allows more switching to allow one thread to go. When going through the yield file and getting the percentage I see that its percentage is close to about half of the regular ManyThread.java file I made. The higher the coefficient of variation the greater the dispersion of data that we have. 
		


ManyThreads.java
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ javac ManyThreads.java 
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
    1167
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
     995
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
    1202
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
    1052
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
    1364
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
    1132
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
    1015
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
    1109
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
    1249
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreads | uniq | wc -l
     915

ManyThreadsYield.java
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ javac ManyThreadsYield.java 
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   67727
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   64800
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   72375
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   68458
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   76596
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   77624
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   75346
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   77131
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   66638
Mauricios-MacBook-Pro:desktop mauriciofloydianrenon$ java ManyThreadsYield | uniq | wc -l
   75848