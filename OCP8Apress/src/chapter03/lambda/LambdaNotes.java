package chapter03.lambda;

public class LambdaNotes {

}

// the arrow operator for defining lambda functions , the double colon operator
// :: used for method references

// Lambdas support functional programming paradigm.

// Lambda functions can be stored in variables , passed as arguments to other
// functions , or returned from other functions just like primitive types and
// reference variables.

// lambda functions are pieces of code that can be passed around you can
// consider that the functional paradigm supports "code as data"
//

// Lambda Function Syntax
// Lambda Parameteres -> LambdaBody

// - when more than one parameter is passed , they are seperated by commas.
// - arrow operator is required because we neet to syntactically seperate the
// parameter from the body.
// - lambda body can be expression or a block.
// the compiler infers the type of the parameters if you do not specify the type
// parameters in a lambda function defitinition.
// - When you specify the type of parameters , you need to specify all or none ;
// or else you will get a compiler error.
// - you can omit the parenthesis if there is only one parameter. but in this
// case you cannot provide the type explicitly.
// - the return type of the lambda function is inferred from the body.
// - if no parameters , then empty paranthesis () must be provided.
//

// lambdas , anonymous function or unnamed function ; they are functions without
// a name and are not associated with any class.

// Lambda functions can refer to local variables from the enclosing scope. the
// variable need to be explicitly declared final or that variable will be
// treated as effectivelly final.