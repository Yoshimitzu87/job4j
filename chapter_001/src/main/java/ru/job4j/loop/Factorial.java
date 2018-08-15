package ru.job4j.loop;
/**
 * Factorial.
 *
 * @author Anton Frolov (mailto:spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */

   public class Factorial{
      public int calc(int n) {
          int result = 1;
          for (int i = 2; i <= n; i++)
              result *= i;
              if (n < 0) return;
           return n;

      }
   }