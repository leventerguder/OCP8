package mock;

class ClassA {
}

interface InterfaceB {
}

class ClassC {
}

class TestQ17 extends ClassA implements InterfaceB {
	String msg;
	ClassC classC;
}

public class QX17 {

}

//a) Class Test is related with ClassA with a HAS-A relationship. (false)
//b) Class Test is related to ClassC with a composition relationship. (true)
//c) Class Test is related with String with an IS-A relationship. (false)
//d) Class ClassA is related with InterfaceB with an IS-A relationship (false)