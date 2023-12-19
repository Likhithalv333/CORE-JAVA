import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Mobile {
    String name;
    String color;
    double price;

    public Mobile(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
	@override
		public String tto String(){
			return "Mobile"
		}
}

public class MobileOperations {
    public static void main(String[] args) {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("iPhone X", "Silver", 999.99));
        mobiles.add(new Mobile("Samsung Galaxy S21", "Black", 1099.99));
        mobiles.add(new Mobile("Oppo Find X2", "Red", 799.99));
        mobiles.add(new Mobile("Realme 7", "Blue", 299.99));

        // Filter Apple mobiles
        List<Mobile> appleMobiles = mobiles.stream()
                .filter(mobile -> mobile.name.startsWith("iPhone"))
                .collect(Collectors.toList());
        System.out.println("Apple Mobiles: " + appleMobiles);

        // Filter mobiles with price > 10000
        List<Mobile> highPriceMobiles = mobiles.stream()
                .filter(mobile -> mobile.price > 10000)
                .collect(Collectors.toList());
        System.out.println("Mobiles with price > 10000: " + highPriceMobiles);

        // Filter Apple mobiles with color red and cost > 50000
        List<Mobile> expensiveRedAppleMobiles = mobiles.stream()
                .filter(mobile -> mobile.name.startsWith("iPhone"))
                .filter(mobile -> mobile.color.equalsIgnoreCase("Red"))
                .filter(mobile -> mobile.price > 50000)
                .collect(Collectors.toList());
        System.out.println("Expensive Red Apple Mobiles: " + expensiveRedAppleMobiles);

        // Collect mobiles in Set format where color: 'blue' cost < 10000
        Set<Mobile> blueAffordableMobiles = mobiles.stream()
                .filter(mobile -> mobile.color.equalsIgnoreCase("Blue"))
                .filter(mobile -> mobile.price < 10000)
                .collect(Collectors.toSet());
        System.out.println("Blue Affordable Mobiles: " + blueAffordableMobiles);

        // Collect mobiles in List format where color = 'red'
        List<Mobile> redMobiles = mobiles.stream()
                .filter(mobile -> mobile.color.equalsIgnoreCase("Red"))
                .collect(Collectors.toList());
        System.out.println("Red Mobiles: " + redMobiles);

        // Filter Samsung mobiles and get the first mobile
        Mobile firstSamsungMobile = mobiles.stream()
                .filter(mobile -> mobile.name.startsWith("Samsung"))
                .findFirst()
                .orElse(null);
        System.out.println("First Samsung Mobile: " + firstSamsungMobile);

        // Filter Oppo mobiles and get the third mobile
        Mobile thirdOppoMobile = mobiles.stream()
                .filter(mobile -> mobile.name.startsWith("Oppo"))
                .skip(2)
                .findFirst()
                .orElse(null);
        System.out.println("Third Oppo Mobile: " + thirdOppoMobile);

        // Filter Realme mobiles data is not present, give the message
        List<Mobile> realmeMobiles = mobiles.stream()
                .filter(mobile -> mobile.name.startsWith("Realme"))
                .collect(Collectors.toList());
        if (realmeMobiles.isEmpty()) {
            System.out.println("Realme mobiles data is not present.");
        }

        // Filter Apple mobiles and print the count
        long countAppleMobiles = mobiles.stream()
                .filter(mobile -> mobile.name.startsWith("iPhone"))
                .count();
        System.out.println("Count of Apple Mobiles: " + countAppleMobiles);
    }
}In Java, when data is retrieved from a database and no result is found, its common to return null to indicate the absence of a value. on tge null if we are doing any operations leads to NullPointerExceptions (NPEs). To address this issue, the Optional class was introduced in Java 8 to provide a more explicit and safer way of dealing with potentially absent values.

If data is not coming from the database, the recommended approach is to use Optional to wrap the result. If the result is present, you return an Optional containing the result; if the result is absent (for example, if no data is found in the database), you return an empty Optional.

Instead of returning null to indicate the absence of a result, you use Optional.empty(). This eliminates the need for explicit null checks and provides a more expressive way to handle scenarios where no employee is found.

#Before Optional
public class OptionalEx {
	public static Employee getEmp(int empId)
	{	return null;
	}
	public static void main(String[] args) {
		Employee emp = OptionalEx.getEmp(2);
		System.out.println(emp.getEmpSalary());
	}
}

#Using Optional
public class OptionalEx {
	public static Optional<Employee> getEmp(int empId)
	{	if(empId %2 == 0)
		{	return Optional.of(new Employee(1001, "aaa", 10000.45));
		}
		else
		{	return Optional.empty();
		}
	}
	
	public static void main(String[] args) {
		Optional<Employee> emp = OptionalEx.getEmp(2);
		
		if(emp.isPresent())
		{	System.out.println(emp.get().getEmpSalary());
		}
		else {
			System.out.println("Data is not availavle");
		}
	}
}
					Garbage Collector  
					 ======****=====
C-language:
	The memory allocated using malloc() function.
	The memory destroyed using free() function. 

CPP-language:
	The memory allocated using constructors.	
	The memory destroyed using destructors.

Java-language:
	The memory allocated when we create the object.
	The memory destroyed automatically by GarbageCollector.

In a programming languages like C,CPP, allocating and deallocating memory is a manual process. 

In Java we are allocation memory by creating object, process of deallocating memory is handled automatically by the garbage collector. 

Q. What is automatic Garbage Collection? 
Ans: Automatic garbage collection is the process of looking at		 heap memory, identifying which objects are in use and		 which are not, and deleting the unused objects.

Q. What is the meaning of used & un-used objects? 
Ans: An in use object, or a referenced object, means the			object is having the reference.
	An unused object,or unreferenced object, means the object without reference. 

Q. What is Garbage?
Ans: Garbage means an object without reference.Garbage				collector will collect the garbage. 

In Application level the good practice is, 
step 1: Create the object. 
step 2: Use the object.  
step 3: Once the usage completed make the object un-referenced

Making the object is un-referenced: 
1.  Assigning the null value to object. 
			Test t = new Test();
			t = null;
Note: initially t-reference is pointing to Test object, later that reference is reassigned to null, so the Test object becomes un-referenced it will collect by Garbage Collector. 

2. Reassign reference-variable
class Test 
{	public static void main(String[] args) 
	{	String s1 = "ratan";
		String s2 = "anu";
		System.out.println(s1+" "+s2);
		s1 = s2;
		System.out.println(s1+" "+s2);
	}
}
D:\>java Test
ratan anu
anu anu

			s1 ----> ratan
			s2 ----> anu
			s1 = s2		//here s1 is poinnting to s2 
				   ----> ratan
			s1,s2  ----> anu

Note: s1=s2 Here both references are pointing to "anu" so the "ratan" object becomes un-referenced & destroyed by Garbage Collector. 

3. When we create the object inside the method,once the method is completed object becomes un-referenced.
			void m1()
			{	Test t = new Test();
				stack		heap 
			}
Note: When we create the object, the reference varaible is stored in stack memory, Object is stored in heap memory.Once the method is completed then the stack memory varaible is destoryed, then the object becomes un-referenced & destroy by Garbage Collector.  

ex: 
class Test 
{	public void finalize()
	{  System.out.println("object destroyed.....");
	}
	public static void main(String[] args) 
	{	//initially t1,t2 pointing to object 
		Test t1 = new Test();
		Test t2 = new Test();
		
	//t1,t2 reassigned to null previous object becomes un-ref
		t1 = null;
		t2 = null; 
	
	//call the garbage collector using gc() method
		System.gc();
	}
}

1. There are two ways, 
	a. Automatic garbage Collection. 
			Garbage Collector called by JVM. 
	b. Immidiate garbage Collection. 
			Garbage Collector called by Developer using gc() method. 

2. The finalize() method automatically called by garbage		collector just before destroing every object. 
3. In finalize method if any exceptions are raised those		exceptions are ignored and objects are destroyed.
		public void finalize()
		{	System.out.println("Object destoryed");
			System.out.println(10/0);
		}	
4. Garbage Collector internally uses "mark and sweep"			algorithm to destroy the useless objects.

Calling Garbage Collector: 
	we can call the GC in two ways 
		i.	System  class	:	 gc()    : static method
				System.gc(); 

		ii.	Runtime class	:	 gc()    : instance method 
				Runtime r = Runtime.getRuntime();
				r.gc(); 

Note:  Only Runtime class gc() method can call the garbage collector directly. The System.gc() internally calls Runtime class gc() to call the Garbage Collector. 	

ex: Runtime class used to interact with Runtime resources.
class Test 
{     public static void main(String[] args) 
      {	   	
	Runtime r = Runtime.getRuntime();
	System.out.println("Total memory....."+r.totalMemory());
	System.out.println("Free memory....."+r.freeMemory());
	
	for(int i=0;i<100000;i++)
	{	Test t =  new Test();  
	} 
	System.out.println("Free memory after creating  1L..."+r.freeMemory());

	System.out.println(r.availableProcessors());
	}
}

final vs. finally vs. finalize: 
final modifier: 
	final classes can not inherit. 
	final methods can not override.
	final variables can not be re-initialized. 

finally block: 
	code executed both normal & abnormal cases. 

finalize method: 
	This method is called by garbage collector before destroing the object. 


FacFactory method: 
	The method returns the object is called Factory method. 
		ex: Runtime r = Runtime.getRuntime(); 
			Integer i = Integer.valueOf(100);




