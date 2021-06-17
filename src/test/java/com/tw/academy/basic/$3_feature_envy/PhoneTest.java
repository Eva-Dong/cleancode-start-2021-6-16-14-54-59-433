package com.tw.academy.basic.$3_feature_envy;

import com.tw.academy.basic.$3_feature_envy.practiceTwo.Customer;
import com.tw.academy.basic.$3_feature_envy.practiceTwo.Phone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneTest {
    @Test
    public void should_return_format_phone_number(){
        Phone phone = new Phone("1234567890");
        String actual = phone.getMobilePhoneNumber();

        assertEquals("(123) 456-7890", actual);
    }
}
