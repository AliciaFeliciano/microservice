package br.com.zup.gateway.controllers.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsumerAddressRegisterDTO {

    @NotBlank(message = "The name cannot be blank" )
    @Size(min = 3, max = 20)
    private String name;

    @NotBlank(message = "Age cannot be blank")
    @Size(max = 130)
    private String age;

    @NotBlank(message = "Email cannot be blank" )
    @Email(message = "Out of the norm")
    private String email;

    @NotBlank(message = "Address cannot be blank")
    private AddressDTO address;

    public ConsumerAddressRegisterDTO() {

    }
}
