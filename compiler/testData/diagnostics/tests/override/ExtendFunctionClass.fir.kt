package extendFunctionClass

class A : Function1<Int, Int> {

}

class B : Function1<Int, Int> {
    override fun invoke(p1 : Int) = p1
}
