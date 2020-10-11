#pragma warning(disable:4996)
#define MAX 500
#define QUERY 11
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>



int main()
{
   ////////////////YOUR CODE//////////////////////

   int day, money;
   int numberOFcoin = 0;
   scanf("%d%d", &day, &money);
   int* day_coin;
   day_coin = (int*)calloc(day, sizeof(int));
   for (int i = 0; i < day; i++) scanf("%d", &day_coin[i]);
   // for (int i = 0; i < day; i++) printf("\n%d", day_coin[i]);

   

   for (int i = 0; i < day; i++)
   {
      int now_coin = day_coin[i];
      int next_day = i+1;
      if (day==i+1)
      {
         money += numberOFcoin * now_coin;
         break;
      }
      if (now_coin < day_coin[next_day])
      {
         numberOFcoin = money / now_coin;
         money %= now_coin;
         while (day_coin[i] <= day_coin[next_day])
         {
            i++;
            next_day++;
            if (next_day == day) break;
         }
         i--;
      }
      else
      {
         if (numberOFcoin != 0) money += numberOFcoin * now_coin;
         while (day_coin[i] >= day_coin[next_day])
         {
            i++;
            next_day++;
            if (next_day == day) break;
         }
         i--;
      }
   }

   printf("\n\n%d", money);

   ////////////////YOUR CODE//////////////////////
}