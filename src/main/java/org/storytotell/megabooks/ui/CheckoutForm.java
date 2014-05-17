package org.storytotell.megabooks.ui;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by fusion on 5/17/14.
 */
@Named("checkoutForm")
@RequestScoped
public class CheckoutForm {
    @NotNull
    private String name = null;

    @NotNull @Pattern(regexp = ".*@.*\\..*", message = "Email must be a real email address")
    private String email = null;

    @Pattern(regexp = "^[0-9 ()+-]*$", message = "Phone must look more like a phone number")
    private String phone = null;

    public CheckoutForm() {}

    public void checkout() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
