package self_learning;

public class AnnotationDemo 
{

	public static void main(String[] args) 
	{
		
		AnnotSamsung obj = new AnnotSamsung("Galaxy",6);
		System.out.println("Model is "+ obj.model);
		
//		to print version and OS
		
//		Using reflection API- used to get features of the object
		
		@SuppressWarnings("rawtypes")
		Class c = obj.getClass();
		
		@SuppressWarnings("unchecked")
		
		java.lang.annotation.Annotation an= c.getAnnotation(AnnotSmartPhone.class);
		AnnotSmartPhone s = (AnnotSmartPhone) an;
		System.out.println("OS is "+ s.OS());
		System.out.println("Version is "+ s.version());
		
		
	}

}
