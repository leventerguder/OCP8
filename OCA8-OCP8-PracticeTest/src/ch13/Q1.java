package ch13;

public class Q1 {

}

class News1<News1> {
	// The type parameter News1 is hiding the type News1<News1>
}

// class New2<?> {} // compile error

//

class News3<Object> {
	// The type parameter Object is hiding the type Object
}