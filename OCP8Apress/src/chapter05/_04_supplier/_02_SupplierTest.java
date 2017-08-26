package chapter05._04_supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class _02_SupplierTest {

	public static void main(String[] args) {
		Supplier<String> strDate = () -> LocalDateTime.now().toString();
		System.out.println(strDate.get());
	}
}
