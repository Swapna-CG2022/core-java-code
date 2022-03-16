package com.cg.m1.exceptionhandlingquestions;

public class ExceptionImplementation 
{

	
	public String checkForException(double number1,double number2,char opr) throws Exception
	{
		try {
			if(number1>1000 || number2>1000)
			{
				throw new NumberIsLargeException("number is greater than 1000");
				
			}
		    if(number1<0 || number2<0)
			{
				throw new NumberNegativeException("number is negative");
			}
			if(opr !='*' && opr!='-' && opr != '+' && opr!= '/')
			{
				throw new Exception(opr + " is not a valid operator");
				
			}
			
		}catch(NumberIsLargeException nle)
		{
			System.out.println(nle.getMessage());
			return nle.getMessage();
		}
		catch(NumberNegativeException ne)
	{
			System.out.println(ne.getMessage());
		return ne.getMessage();
	}
		catch(Exception e)
	{
		System.out.println(e.getMessage());
		return e.getMessage();
	}
				
		return "no Exception found";
	}
	
	public double compute(double val1,double val2,char opr)
	{
		double ans=0.0;
		try
		{
			String str = checkForException(val1,val2,opr);
			System.out.println(str);
			if(str.equals("no Exception found"))
			{
				
				if(opr=='*')
				{
					ans=val1*val2;
				}
				else if(opr=='-')
				{
					ans=val1-val2;
				}
				else if(opr=='+')
				{
					ans=val1+val2;
				}
				else if(opr=='/')
				{
					ans=val1/val2;
				}
			}
			else
			{
				return 0.0;
			}
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		return ans;
	}
}
