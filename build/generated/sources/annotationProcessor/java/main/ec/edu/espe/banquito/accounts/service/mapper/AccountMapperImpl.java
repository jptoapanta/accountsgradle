package ec.edu.espe.banquito.accounts.service.mapper;

import ec.edu.espe.banquito.accounts.controller.req.AccountReqDto;
import ec.edu.espe.banquito.accounts.controller.res.AccountResDto;
import ec.edu.espe.banquito.accounts.model.Account;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-27T17:26:25-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountResDto toRes(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountResDto.AccountResDtoBuilder accountResDto = AccountResDto.builder();

        accountResDto.id( account.getId() );
        accountResDto.uniqueKey( account.getUniqueKey() );
        accountResDto.codeInternalAccount( account.getCodeInternalAccount() );
        accountResDto.name( account.getName() );
        accountResDto.totalBalance( account.getTotalBalance() );
        accountResDto.availableBalance( account.getAvailableBalance() );
        accountResDto.blockedBalance( account.getBlockedBalance() );
        accountResDto.lastInterestCalculationDate( account.getLastInterestCalculationDate() );
        accountResDto.allowOverdraft( account.getAllowOverdraft() );
        accountResDto.maxOverdraft( account.getMaxOverdraft() );
        accountResDto.clientUk( account.getClientUk() );
        accountResDto.groupUk( account.getGroupUk() );
        accountResDto.productUk( account.getProductUk() );

        return accountResDto.build();
    }

    @Override
    public List<AccountResDto> toRes(List<Account> accounts) {
        if ( accounts == null ) {
            return null;
        }

        List<AccountResDto> list = new ArrayList<AccountResDto>( accounts.size() );
        for ( Account account : accounts ) {
            list.add( toRes( account ) );
        }

        return list;
    }

    @Override
    public Account toReq(AccountReqDto account) {
        if ( account == null ) {
            return null;
        }

        Account.AccountBuilder account1 = Account.builder();

        account1.id( account.getId() );
        account1.uniqueKey( account.getUniqueKey() );
        account1.codeInternalAccount( account.getCodeInternalAccount() );
        account1.codeInternationalAccount( account.getCodeInternationalAccount() );
        if ( account.getAccountHolderType() != null ) {
            account1.accountHolderType( Enum.valueOf( Account.AccountHolderType.class, account.getAccountHolderType() ) );
        }
        account1.accountHolderCode( account.getAccountHolderCode() );
        account1.name( account.getName() );
        account1.totalBalance( account.getTotalBalance() );
        account1.availableBalance( account.getAvailableBalance() );
        account1.blockedBalance( account.getBlockedBalance() );
        if ( account.getState() != null ) {
            account1.state( Enum.valueOf( Account.State.class, account.getState() ) );
        }
        account1.lastInterestCalculationDate( account.getLastInterestCalculationDate() );
        account1.allowOverdraft( account.getAllowOverdraft() );
        account1.maxOverdraft( account.getMaxOverdraft() );
        account1.interestRate( account.getInterestRate() );
        account1.clientUk( account.getClientUk() );
        account1.groupUk( account.getGroupUk() );
        account1.productUk( account.getProductUk() );

        return account1.build();
    }
}
