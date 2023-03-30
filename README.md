# Automation workshop Jumbo store

The automation of a purchase flow for the cheapest `Chorizo` product on
the [Jumbo stores website](https://www.tiendasjumbo.co/) is performed.

## Guidelines

#### For this challenge the following must be used:

1. Use at least the following tools:
    - Selenium.
    - Serenity BDD.
    - Cucumber.
2. Use Gherkin language.
3. ScreenPlay design pattern.

#### In addition, some conditions:

- Must run on Coach machine (watch out for `Locators`).
- Prohibited to use `Thread.sleep();`.
- Step Definitions with little logic.
- Use `Try/catch` sentences.
- Must not include credentials in the repo.
- Case must include login.
- Deadline 5:00 PM.

### Value-added

- Perform Hook configuration.
- Use of online scenarios.
- A scenario that allows to buy more than 1 product.

> **Note**
> - Use all the tools learned with ScreenPlay.
> - If implicit waits will be used, it should be through the `serenity.properties` file.
> - The user and password must be changeable in a `valores.properties` file.
> - If explicit waits will be used, follow provided example.
> - The project must have configured waits of **ONE TYPE** only.

### Case

As a precondition, an account must already be created and functional on the site. The access credentials must be
modified in the resource `valores.properties` hosted in `AutoJumbo/src/test/resources`, and must have the following
format.

```properties
EMAIL=example@gmail.com
PASSWORD=examplePassword
```

#### Then, the case proceeds with the following steps:

1. Enter the website [https://www.tiendasjumbo.co/](https://www.tiendasjumbo.co/).
2. Click on 'Mi Cuenta'.
3. Enter e-mail and password in the section 'Entrar con e-mail y contraseña'.
4. Login.
5. Search for the word 'Chorizo' in the search box.
6. Select category 'Lácteos, Huevos Y Refrigerados'.
7. Set shipping address.
8. Add to cart the lowest cost product.
9. Take the process to the checkout screen.

- - -
*By: Jonathan Vargas 🐢 Ococho*

<a href="https://gitmoji.dev">
  <img
    src="https://img.shields.io/badge/gitmoji-%20😜%20😍-FFDD67.svg?style=flat-square"
    alt="Gitmoji"
  />
</a>