
package AbstractFactory.abstractfactory;


import AbstractFactory.model.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
