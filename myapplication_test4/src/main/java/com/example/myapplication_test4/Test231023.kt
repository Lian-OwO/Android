package com.example.myapplication_test4;

class Test231023 constructor( name:String, age:Int,  email:String){
    constructor(name:String,  age:Int,  email:String,  password:String) : this(name, age, email)
    var name : String = "서청빈"
    var email : String= "aaa.naver.com"

    //초기화를 미루겠다. 결론, 사용하는 시점에 초기화함
    lateinit var name2:String;
    var email2:String = "클래스 내부에서 선언만 안됨."
    var price : Int = 1000

    //다른 변수에 재할당(사용하는 시점에 초기화가 되고, 값도 할당 됨( 표현식)
    // 앱이 시작하면 순차적으로 다 초기화를 해서 사용됨
    // 하지만, lateinti, by lazy , 특징은 뒤늦게 초기화를 한다. 사용하는 시점에 초기화를 한다
    // 사용도 안하는데 메모리에 다 로드 하는 것이 아니라, 실제 사용하는 것들만 매모리에 로드한다.

//    val data4_2 = test1.data4
//    println("data4_2 : "data4_2);
//
//    val data4. Int by lazy{
//        println("by laze 사용 : ")
//    }


}

fun main(){
    val test1 : Test231023 = Test231023("서청빈",29, "aaa.naver.com", "1234")
    println("비 데이터 클래스 toString 해보기(의미없는 메모리 주소값 표기 : " + test1.toString())

    test1.name2 = "초기값 할당 후 사용"
    val lateInitname = test1.name2;
    println("lateInitName 사용:" + lateInitname)



    val test2 : User = User("서청빈","aaa.naver.com","1234")
    println("데이터 클래스 toString 해보기(실제 값 표기)" + test2.toString())


    val data5 : Array<String> = Array(3,{"기본값"})
}
