package Danger;

import java.util.Scanner;

public class Remove_Special_Junk_Character
{
	public static void main(String[] args) 
	{
	String s="8768tghjv%$#$%^%$dguv26q89ryo3     2yb9oo1vgh(*&^%*&^%$fyuior6879r*&^%fugkjhjl;'oiugph@#$%^&*((*&^%$#KHGKJHGVNBJ<HMHVNVBN";
	String s1=s.replaceAll("[^a-zA-Z0-9]", ""); // with the help of regular expression and use replaceall function 
	System.out.println(s1);
}
}