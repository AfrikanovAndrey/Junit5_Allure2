package com.propellerads.tests;

import com.propellerads.tests.extension.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ClassExtension.class)
public class TestWithExtensions {

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @Test
    @ExtendWith(FirtsExtension.class)
    @ExtendWith(SecondExtension.class)
    public void check1(){
        System.out.println("Check 1");
    }

    @Test
    @ExtendWith({SecondExtension.class, FirtsExtension.class})
    void check2(){
        System.out.println("Check 2");
    }

    @Test
    @ExtendWith({FirtsExtension.class, ThirdBeforeExtension.class})
    void check3(){
        System.out.println("Check 3");
    }

    @Test
    @ExtendWith({FirtsExtension.class, FourthAfterExtension.class})
    void check4(){
        System.out.println("Check 4");
    }
}
