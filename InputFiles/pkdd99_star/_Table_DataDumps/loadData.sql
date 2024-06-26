use pkdd99_star;

SET FOREIGN_KEY_CHECKS=0;

TRUNCATE TABLE LOAN;
TRUNCATE TABLE ORDERS;

TRUNCATE TABLE DATE;
LOAD DATA INFILE  'C:/Users/Aggeliki_Dougia/AppData/Roaming/SPB_Data/git/DelianCubeEngine/InputFiles/pkdd99_star/_Table_DataDumps/date.csv'
INTO TABLE date FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES
(
    SK_Day, @var1, Month, Year, date.All
)
SET date.day = STR_TO_DATE(@var1, '%d/%m/%Y');


TRUNCATE TABLE PAYMENT_REASON;
LOAD DATA INFILE  'C:/Users/Aggeliki_Dougia/AppData/Roaming/SPB_Data/git/DelianCubeEngine/InputFiles/pkdd99_star/_Table_DataDumps/payment_reason.csv'
INTO TABLE payment_reason FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE STATUS;
LOAD DATA INFILE  'C:/Users/Aggeliki_Dougia/AppData/Roaming/SPB_Data/git/DelianCubeEngine/InputFiles/pkdd99_star/_Table_DataDumps/status.csv'
INTO TABLE status FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE ACCOUNT;
LOAD DATA INFILE  'C:/Users/Aggeliki_Dougia/AppData/Roaming/SPB_Data/git/DelianCubeEngine/InputFiles/pkdd99_star/_Table_DataDumps/account.csv'
INTO TABLE account FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

LOAD DATA INFILE  'C:/Users/Aggeliki_Dougia/AppData/Roaming/SPB_Data/git/DelianCubeEngine/InputFiles/pkdd99_star/_Table_DataDumps/loan.csv'
INTO TABLE loan FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

LOAD DATA INFILE  'C:/Users/Aggeliki_Dougia/AppData/Roaming/SPB_Data/git/DelianCubeEngine/InputFiles/pkdd99_star/_Table_DataDumps/orders.csv'
INTO TABLE orders FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES
(
order_id, account_id, bank_to, account_to, amount, Reason_id
);
