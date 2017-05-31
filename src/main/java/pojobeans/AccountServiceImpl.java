package pojobeans;

/**
 * Created by tuananh on 05/31/17.
 */
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

// Sử dụng seter khi dùng thẻ <property />
    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

// Sử dụng contructor khi dùng thẻ <contructor-arg />
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {

        Account sourceAccount = accountRepository.find(fromAccountId);
        Account targetAccount = accountRepository.find(toAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        targetAccount.setBalance(targetAccount.getBalance() + amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccount);
    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountRepository.find(accountId);
        account.setBalance(account.getBalance() + amount);
        accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}

