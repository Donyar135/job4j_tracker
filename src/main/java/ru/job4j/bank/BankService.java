package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * В этом классе мы разработываем модель для банковской системы.
 * В системе можно производить следующие действия.
 * 1. Регистрировать пользователя.
 * 2. Удалять пользователя из системы.
 * 3. Добавлять пользователю банковский счет. У пользователя системы могут быть несколько счетов.
 * 4. Переводить деньги с одного банковского счета на другой счет.
 * @author DANIYAR ALDANOV
 * @version 1.0
 * Ссылка а документацию:
 * <a href="http://localhost:63342/job4j_tracker/tracker/target/site/apidocs/ru/job4j/bank/BankService.html?_ijt=bgtkbnpb31t7adtvkomagtvo4d&_ij_reload=RELOAD_ON_SAVE">...</a>
 */

public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа Map
     * Это поле содержит всех пользователей банковской системы с привязанными к ним счетами:
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход заявку и добавляет ее в очередь.
     * Если встречаются 2 пары с одинаковым key,
     * то ячейка value будет заменена на новое значение.
     * @param user задача которая добавляется в очередь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает на вход номер паспорта и удаляет ее из очереди.
     * @param passport данные должны удаляться из системы.
     * Соответсвенно вместе будут удаляться его счета.
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод должен добавить новый счет к пользователю.
     * Сначало найдем пользователя по паспорту используя метод findByPassport.
     * В первом условии проверяем: если такой пользователь есть, то дальше выполняется операция, если нет, то break.
     * В втором условии проверяем: если есть уже у пользователя похожии счет,
     * то мы не можем добавить ему такую же новую счет по принципу коллекции Map.
     * При этом у пользователя системы могут быть несколько счетов.
     * @param passport пасспортные данные у пользователя.
     * @param account добавит новый счет к пользователю при выше написанных условиях.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод поможет найти пользователя из системы.
     * @param passport метод ищет пользователя по номеру пасспорта.
     * @return возвращает найденного пользователя или null если нет такого пользователя.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам.
     * Мы найдем пользователя используя метод findByPassport.
     * Если findByPassport не вернул null,
     * то проверяем счета пользователя проходя быстро через foreach и
     * сравниваем реквезиты ищща свой желаемый реквезит среди всех счетов пользователя.
     * @param passport пасспортные данные пользователя.
     * @param requisite счет пользователя который мы хотим найти.
     * @return возвращает счет пользователя если найдено или null если нет такого пользователя или счета.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт.
     * @param sourcePassport паспортные данные пользователя с которого переводят деньги
     * @param sourceRequisite реквезиты пользователя с которого переводят деньги
     * @param destinationPassport паспортные данные получетеля денег на свой счет.
     * @param destinationRequisite реквезиты пользователя который принимает перечислление денег.
     * @param amount количество денег для перевода.
     * @return возвращает true, если в счете у пользователя с которого переводят деньги достаточно средств 'amount', а иначе метод вернет false.
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);

        if (sourceAccount != null && destinationAccount != null && sourceAccount.getBalance() >= amount) {

            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            destinationAccount.setBalance(destinationAccount.getBalance() + amount);
            return true;
        }
        return false;
    }

    /**
     * Метод позволяет получить первого пользователя из очереди.
     * @param user пользователь
     * @return возвращает пользователя.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}