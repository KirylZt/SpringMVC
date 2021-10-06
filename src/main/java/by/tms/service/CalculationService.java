package by.tms.service;

import by.tms.entity.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    public double operate(Operation operation) {
        switch (operation.getType()){
            case 1: return operation.getNum1() + operation.getNum2();
            case 2: return operation.getNum1() - operation.getNum2();
            case 3: return operation.getNum1() * operation.getNum2();
            case 4: return operation.getNum1() / operation.getNum2();
        }
        return 0;
    }
}
