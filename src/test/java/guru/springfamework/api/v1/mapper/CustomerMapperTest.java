package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.domain.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerMapperTest {

    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void givenCustomer_WhenMapping_thenReturnCustomerDTO() {
        //given
        Customer customer = new Customer();
        customer.setId(2L);
        customer.setFirstName("test");
        customer.setCustomerUrl("testUrl");

        //when
        CustomerDTO customerDTO = customerMapper.CustomerToCustomerDTO(customer);

        //then
        assertEquals(Long.valueOf(2l), customerDTO.getId());
        assertEquals("test", customerDTO.getFirstName());
        assertEquals("testUrl", customerDTO.getCustomerUrl());
    }
}