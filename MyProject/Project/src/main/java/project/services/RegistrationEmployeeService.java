package project.services;

import project.forms.RegistrationForm;


public interface RegistrationEmployeeService {
    /**
     * Принимает на вход данные регистрации
     * Шифрует пароль
     * Сохраняет данные в БД
     * @param form
     * @return email пользователя
     */
String registration(RegistrationForm form);


}
