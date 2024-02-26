package tfoc.javamutationtestingworkshop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SumService {


    public int sum(int a, int b){

        return a + b;
    }

    public String compareToFifty(int value){
        String message = "Could not determine comparison";

        if(value > 50){
            message = "Greater than 50";
        }else{
            message = "Smaller than or equal to 50";
        }

        return message;
    }
}
