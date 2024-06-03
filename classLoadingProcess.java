package com.te.learnJava8.logics;

class classLoadingProcess
{

	static int staticVar =10;
	static
	{

		System.out.println("Static Block Executed");
		staticVar=100;

	}

	int instanceVar =20;

	{
		System.out.println("Non-Static Block Executed");
		instanceVar =50;
	}

	static void staticMethod()
	{
		System.out.println("static method executed");
	}
	
	classLoadingProcess()
	{
		instanceVar=200;
		System.out.println("Instructions Executed");
		System.out.println("Constructor Executed");
	}

	
	public void nonStaticMethod()
	{
		System.out.println("Non Static Method Executed");
	}

	static class StaticNestedClass
	{
		void display()
		{
			System.out.println("Static Nested Class Executed");
		}


	}


		class InnerClass
		{
			void display()
			{
				System.out.println("Inner Class Executed");
			}
			
		}
	
		
			public static void main(String args[])
			{
				System.out.println("main() starts");
				
				classLoadingProcess.staticMethod();
				
				System.out.println("static var" + classLoadingProcess.staticVar);
				
				classLoadingProcess cp= new classLoadingProcess();
				
				cp.nonStaticMethod();
				
				System.out.println("Non Static | Instance Variable" + cp.instanceVar);
				
				StaticNestedClass sn = new StaticNestedClass();
				sn.display();
				
				InnerClass ic = cp.new InnerClass();
				ic.display();
				
				System.out.println("main ends");
			}
	
	}
	
