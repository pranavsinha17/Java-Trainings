package Lab10;
import java.util.function.Consumer;
import java.util.function.Supplier;
class MethodRef {
	String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
public class Exercise4 {
	public static void main(String ar[])
	{
		MethodRef m=new MethodRef();
		Consumer<String> consumer=m::setName;
		consumer.accept("pranav");
		Supplier<String> supplier=m::getName;
		System.out.println("Name: "+supplier.get());
	}

}

