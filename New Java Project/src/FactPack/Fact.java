/**
 * 
 */
/**
 * @author guruk
 *
 */
package FactPack;
public class Fact
{
	public static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i=2; i<=n; i++) 
            res *= i; 
        return res; 
    } 
}