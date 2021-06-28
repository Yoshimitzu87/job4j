package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    /**
     *поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Этот метод  добавляет пользователя в систему.
     * @param user - пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }

    /**
     * Добавляет новый счет к пользователю
     * @param passport - номер паспорта.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null){
            List<Account> list = users.get(user);
            if (!list.contains(account)){
                list.add(account);
            }
        }


    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport - номер паспорта.
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User index : users.keySet()){
            if (index.getPassport().equals(passport)){
                user = index;
                break;
            }

        }
        return user;
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport - номер паспорта.
     * @param requisite - номер счета.
     */
    public Account findByRequisite (String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null){
            List<Account> list = users.get(user);
            for (Account acc : list){
                if (acc.getRequisite().equals(requisite)){
                    account = acc;
                    break;
                }
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {


            boolean rsl = false;
            Account srcAccount = findByRequisite(srcPassport, srcRequisite);
            if (srcAccount == null || srcAccount.getBalance() < amount) {
                rsl = false;
            } else {
                Account destAccount = findByRequisite(destPassport, destRequisite);
                if (destAccount == null) {
                    rsl = false;
                } else {

                    double value = srcAccount.getBalance() - amount;
                    srcAccount.setBalance(value);
                    destAccount.setBalance((destAccount.getBalance() + amount));
                }
            }
            return rsl;
    }
}