package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null){
            List<Account> list = users.get(user);
            if (!list.contains(account)){
                list.add(account);
            }
        }


    }

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
                double value = srcAccount.getBalance() - amount;
                srcAccount.setBalance(value);
                destAccount.setBalance((destAccount.getBalance() + amount));
            }
            return rsl;
    }
}