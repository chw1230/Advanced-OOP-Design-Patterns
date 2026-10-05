package AdvancedOOP.AbstractFactoryPattern;

public class Client {
    private AbstractProductCPU cpu;
    private AbstractProductMEMORY memory;

    Client(ComputerFactory factory) {
        cpu = factory.createCPU();
        memory = factory.createMEMORY();
    }

    void run() {
        cpu.process();
        memory.process();
    }
}

/* 시나리오
1(공장 전달). Client는 생성자 Client(ComputerFactory factory)로 A사 공장 또는 B사 공장 중 하나를 받는다.
2. 이때 Client는 받은 공장을 ComputerFactory(규격)로만 알기 때문에, 어느 회사 공장인지는 모른다.
3(부품 생성과 부품 저장). 받은 공장의 createCPU(), createMEMORY()를 호출하면, 실제 공장에 맞는 회사의 부품이 생성되어(factory에 들어온 회사의) cpu, memory 변수에 담긴다.
4. A사 공장이면 A사 부품만, B사 공장이면 B사 부품만 나오므로 회사가 섞일 수 없다.
5(동작). 이후 run()을 실행하면 담긴 부품의 process()가 호출되어, 각 회사 부품에 맞는 동작이 진행된다.
6. 결국 Client 코드는 그대로 두고, 넘겨주는 공장( factory에 들어가는 )만 바꾸면 부품 세트 전체가 바뀐다.
 */