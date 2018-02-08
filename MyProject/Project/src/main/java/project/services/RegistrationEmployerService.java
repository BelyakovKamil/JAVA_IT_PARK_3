package project.services;//package project.services;

import project.forms.RegistrationForm;


public interface RegistrationEmployerService {
    /**
     * Принимает на вход данные регистрации
     * Шифрует пароль
     * Сохраняет данные в БД
     * @param form
     * @return name пользователя
     */
String registration(RegistrationForm form);
//String registration(UsersProfileForm form);

    boolean confirm(String confirmString);
}
