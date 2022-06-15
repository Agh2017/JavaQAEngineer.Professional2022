
package ru.moneta.schemas.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.moneta.schemas.messages package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateAccountResponse_QNAME = new QName("http://www.moneta.ru/schemas/messages.xsd", "CreateAccountResponse");
    private final static QName _GetOperationDetailsByIdRequest_QNAME = new QName("http://www.moneta.ru/schemas/messages.xsd", "GetOperationDetailsByIdRequest");
    private final static QName _CreateProfileResponse_QNAME = new QName("http://www.moneta.ru/schemas/messages.xsd", "CreateProfileResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.moneta.schemas.messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindOperationsListRequest }
     * 
     */
    public FindOperationsListRequest createFindOperationsListRequest() {
        return new FindOperationsListRequest();
    }

    /**
     * Create an instance of {@link GetFinancialFlowsListResponse }
     * 
     */
    public GetFinancialFlowsListResponse createGetFinancialFlowsListResponse() {
        return new GetFinancialFlowsListResponse();
    }

    /**
     * Create an instance of {@link GetTurnoverListResponse }
     * 
     */
    public GetTurnoverListResponse createGetTurnoverListResponse() {
        return new GetTurnoverListResponse();
    }

    /**
     * Create an instance of {@link CheckProfileResponse }
     * 
     */
    public CheckProfileResponse createCheckProfileResponse() {
        return new CheckProfileResponse();
    }

    /**
     * Create an instance of {@link FindProfileInfoRequest }
     * 
     */
    public FindProfileInfoRequest createFindProfileInfoRequest() {
        return new FindProfileInfoRequest();
    }

    /**
     * Create an instance of {@link AccessTokenListResponse }
     * 
     */
    public AccessTokenListResponse createAccessTokenListResponse() {
        return new AccessTokenListResponse();
    }

    /**
     * Create an instance of {@link CheckProfileResponse.RequestInfo }
     * 
     */
    public CheckProfileResponse.RequestInfo createCheckProfileResponseRequestInfo() {
        return new CheckProfileResponse.RequestInfo();
    }

    /**
     * Create an instance of {@link InvoiceRequest }
     * 
     */
    public InvoiceRequest createInvoiceRequest() {
        return new InvoiceRequest();
    }

    /**
     * Create an instance of {@link InvoiceRequestType }
     * 
     */
    public InvoiceRequestType createInvoiceRequestType() {
        return new InvoiceRequestType();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link OperationInfo }
     * 
     */
    public OperationInfo createOperationInfo() {
        return new OperationInfo();
    }

    /**
     * Create an instance of {@link PaymentSystemInfoRequest }
     * 
     */
    public PaymentSystemInfoRequest createPaymentSystemInfoRequest() {
        return new PaymentSystemInfoRequest();
    }

    /**
     * Create an instance of {@link PaymentSystemInfoResponse }
     * 
     */
    public PaymentSystemInfoResponse createPaymentSystemInfoResponse() {
        return new PaymentSystemInfoResponse();
    }

    /**
     * Create an instance of {@link PaymentSystemInfoComplexType }
     * 
     */
    public PaymentSystemInfoComplexType createPaymentSystemInfoComplexType() {
        return new PaymentSystemInfoComplexType();
    }

    /**
     * Create an instance of {@link InvoiceBatchRequest }
     * 
     */
    public InvoiceBatchRequest createInvoiceBatchRequest() {
        return new InvoiceBatchRequest();
    }

    /**
     * Create an instance of {@link InvoiceBatchRequestType }
     * 
     */
    public InvoiceBatchRequestType createInvoiceBatchRequestType() {
        return new InvoiceBatchRequestType();
    }

    /**
     * Create an instance of {@link EntityBatchRequestType }
     * 
     */
    public EntityBatchRequestType createEntityBatchRequestType() {
        return new EntityBatchRequestType();
    }

    /**
     * Create an instance of {@link InvoiceBatchResponse }
     * 
     */
    public InvoiceBatchResponse createInvoiceBatchResponse() {
        return new InvoiceBatchResponse();
    }

    /**
     * Create an instance of {@link TransactionBatchResponseType }
     * 
     */
    public TransactionBatchResponseType createTransactionBatchResponseType() {
        return new TransactionBatchResponseType();
    }

    /**
     * Create an instance of {@link InvoiceResponse }
     * 
     */
    public InvoiceResponse createInvoiceResponse() {
        return new InvoiceResponse();
    }

    /**
     * Create an instance of {@link TransactionResponseType }
     * 
     */
    public TransactionResponseType createTransactionResponseType() {
        return new TransactionResponseType();
    }

    /**
     * Create an instance of {@link TransferRequest }
     * 
     */
    public TransferRequest createTransferRequest() {
        return new TransferRequest();
    }

    /**
     * Create an instance of {@link TransactionRequestType }
     * 
     */
    public TransactionRequestType createTransactionRequestType() {
        return new TransactionRequestType();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link TransferBatchRequest }
     * 
     */
    public TransferBatchRequest createTransferBatchRequest() {
        return new TransferBatchRequest();
    }

    /**
     * Create an instance of {@link TransactionBatchRequestType }
     * 
     */
    public TransactionBatchRequestType createTransactionBatchRequestType() {
        return new TransactionBatchRequestType();
    }

    /**
     * Create an instance of {@link TransferBatchResponse }
     * 
     */
    public TransferBatchResponse createTransferBatchResponse() {
        return new TransferBatchResponse();
    }

    /**
     * Create an instance of {@link PaymentRequest }
     * 
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link PaymentRequestType }
     * 
     */
    public PaymentRequestType createPaymentRequestType() {
        return new PaymentRequestType();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link KeyValueAttribute }
     * 
     */
    public KeyValueAttribute createKeyValueAttribute() {
        return new KeyValueAttribute();
    }

    /**
     * Create an instance of {@link PaymentBatchRequest }
     * 
     */
    public PaymentBatchRequest createPaymentBatchRequest() {
        return new PaymentBatchRequest();
    }

    /**
     * Create an instance of {@link PaymentBatchRequestType }
     * 
     */
    public PaymentBatchRequestType createPaymentBatchRequestType() {
        return new PaymentBatchRequestType();
    }

    /**
     * Create an instance of {@link PaymentBatchResponse }
     * 
     */
    public PaymentBatchResponse createPaymentBatchResponse() {
        return new PaymentBatchResponse();
    }

    /**
     * Create an instance of {@link OperationInfoBatchResponseType }
     * 
     */
    public OperationInfoBatchResponseType createOperationInfoBatchResponseType() {
        return new OperationInfoBatchResponseType();
    }

    /**
     * Create an instance of {@link AuthoriseTransactionRequest }
     * 
     */
    public AuthoriseTransactionRequest createAuthoriseTransactionRequest() {
        return new AuthoriseTransactionRequest();
    }

    /**
     * Create an instance of {@link AuthoriseTransactionRequestType }
     * 
     */
    public AuthoriseTransactionRequestType createAuthoriseTransactionRequestType() {
        return new AuthoriseTransactionRequestType();
    }

    /**
     * Create an instance of {@link AuthoriseTransactionResponse }
     * 
     */
    public AuthoriseTransactionResponse createAuthoriseTransactionResponse() {
        return new AuthoriseTransactionResponse();
    }

    /**
     * Create an instance of {@link AuthoriseTransactionBatchRequest }
     * 
     */
    public AuthoriseTransactionBatchRequest createAuthoriseTransactionBatchRequest() {
        return new AuthoriseTransactionBatchRequest();
    }

    /**
     * Create an instance of {@link AuthoriseTransactionBatchRequestType }
     * 
     */
    public AuthoriseTransactionBatchRequestType createAuthoriseTransactionBatchRequestType() {
        return new AuthoriseTransactionBatchRequestType();
    }

    /**
     * Create an instance of {@link AuthoriseTransactionBatchResponse }
     * 
     */
    public AuthoriseTransactionBatchResponse createAuthoriseTransactionBatchResponse() {
        return new AuthoriseTransactionBatchResponse();
    }

    /**
     * Create an instance of {@link ConfirmTransactionRequest }
     * 
     */
    public ConfirmTransactionRequest createConfirmTransactionRequest() {
        return new ConfirmTransactionRequest();
    }

    /**
     * Create an instance of {@link ConfirmTransactionRequestType }
     * 
     */
    public ConfirmTransactionRequestType createConfirmTransactionRequestType() {
        return new ConfirmTransactionRequestType();
    }

    /**
     * Create an instance of {@link ConfirmTransactionResponse }
     * 
     */
    public ConfirmTransactionResponse createConfirmTransactionResponse() {
        return new ConfirmTransactionResponse();
    }

    /**
     * Create an instance of {@link ConfirmTransactionBatchRequest }
     * 
     */
    public ConfirmTransactionBatchRequest createConfirmTransactionBatchRequest() {
        return new ConfirmTransactionBatchRequest();
    }

    /**
     * Create an instance of {@link ConfirmTransactionBatchRequestType }
     * 
     */
    public ConfirmTransactionBatchRequestType createConfirmTransactionBatchRequestType() {
        return new ConfirmTransactionBatchRequestType();
    }

    /**
     * Create an instance of {@link ConfirmTransactionBatchResponse }
     * 
     */
    public ConfirmTransactionBatchResponse createConfirmTransactionBatchResponse() {
        return new ConfirmTransactionBatchResponse();
    }

    /**
     * Create an instance of {@link CancelTransactionRequest }
     * 
     */
    public CancelTransactionRequest createCancelTransactionRequest() {
        return new CancelTransactionRequest();
    }

    /**
     * Create an instance of {@link CancelTransactionRequestType }
     * 
     */
    public CancelTransactionRequestType createCancelTransactionRequestType() {
        return new CancelTransactionRequestType();
    }

    /**
     * Create an instance of {@link CancelTransactionResponse }
     * 
     */
    public CancelTransactionResponse createCancelTransactionResponse() {
        return new CancelTransactionResponse();
    }

    /**
     * Create an instance of {@link CancelTransactionResponseType }
     * 
     */
    public CancelTransactionResponseType createCancelTransactionResponseType() {
        return new CancelTransactionResponseType();
    }

    /**
     * Create an instance of {@link CancelTransactionBatchRequest }
     * 
     */
    public CancelTransactionBatchRequest createCancelTransactionBatchRequest() {
        return new CancelTransactionBatchRequest();
    }

    /**
     * Create an instance of {@link CancelTransactionBatchRequestType }
     * 
     */
    public CancelTransactionBatchRequestType createCancelTransactionBatchRequestType() {
        return new CancelTransactionBatchRequestType();
    }

    /**
     * Create an instance of {@link CancelTransactionBatchResponse }
     * 
     */
    public CancelTransactionBatchResponse createCancelTransactionBatchResponse() {
        return new CancelTransactionBatchResponse();
    }

    /**
     * Create an instance of {@link CancelTransactionBatchResponseType }
     * 
     */
    public CancelTransactionBatchResponseType createCancelTransactionBatchResponseType() {
        return new CancelTransactionBatchResponseType();
    }

    /**
     * Create an instance of {@link RefundRequest }
     * 
     */
    public RefundRequest createRefundRequest() {
        return new RefundRequest();
    }

    /**
     * Create an instance of {@link RefundResponse }
     * 
     */
    public RefundResponse createRefundResponse() {
        return new RefundResponse();
    }

    /**
     * Create an instance of {@link ChargebackRequest }
     * 
     */
    public ChargebackRequest createChargebackRequest() {
        return new ChargebackRequest();
    }

    /**
     * Create an instance of {@link ChargebackResponse }
     * 
     */
    public ChargebackResponse createChargebackResponse() {
        return new ChargebackResponse();
    }

    /**
     * Create an instance of {@link ForecastTransactionRequest }
     * 
     */
    public ForecastTransactionRequest createForecastTransactionRequest() {
        return new ForecastTransactionRequest();
    }

    /**
     * Create an instance of {@link ForecastTransactionResponse }
     * 
     */
    public ForecastTransactionResponse createForecastTransactionResponse() {
        return new ForecastTransactionResponse();
    }

    /**
     * Create an instance of {@link ForecastTransactionResponseType }
     * 
     */
    public ForecastTransactionResponseType createForecastTransactionResponseType() {
        return new ForecastTransactionResponseType();
    }

    /**
     * Create an instance of {@link KeyValueApprovedAttribute }
     * 
     */
    public KeyValueApprovedAttribute createKeyValueApprovedAttribute() {
        return new KeyValueApprovedAttribute();
    }

    /**
     * Create an instance of {@link VerifyTransactionRequest }
     * 
     */
    public VerifyTransactionRequest createVerifyTransactionRequest() {
        return new VerifyTransactionRequest();
    }

    /**
     * Create an instance of {@link VerifyTransactionResponse }
     * 
     */
    public VerifyTransactionResponse createVerifyTransactionResponse() {
        return new VerifyTransactionResponse();
    }

    /**
     * Create an instance of {@link VerifyTransactionResponseType }
     * 
     */
    public VerifyTransactionResponseType createVerifyTransactionResponseType() {
        return new VerifyTransactionResponseType();
    }

    /**
     * Create an instance of {@link VerifyTransferResponseType }
     * 
     */
    public VerifyTransferResponseType createVerifyTransferResponseType() {
        return new VerifyTransferResponseType();
    }

    /**
     * Create an instance of {@link VerifyTransferRequest }
     * 
     */
    public VerifyTransferRequest createVerifyTransferRequest() {
        return new VerifyTransferRequest();
    }

    /**
     * Create an instance of {@link VerifyTransferResponse }
     * 
     */
    public VerifyTransferResponse createVerifyTransferResponse() {
        return new VerifyTransferResponse();
    }

    /**
     * Create an instance of {@link VerifyPaymentRequest }
     * 
     */
    public VerifyPaymentRequest createVerifyPaymentRequest() {
        return new VerifyPaymentRequest();
    }

    /**
     * Create an instance of {@link VerifyPaymentResponse }
     * 
     */
    public VerifyPaymentResponse createVerifyPaymentResponse() {
        return new VerifyPaymentResponse();
    }

    /**
     * Create an instance of {@link VerifyPaymentBatchRequest }
     * 
     */
    public VerifyPaymentBatchRequest createVerifyPaymentBatchRequest() {
        return new VerifyPaymentBatchRequest();
    }

    /**
     * Create an instance of {@link VerifyPaymentBatchResponse }
     * 
     */
    public VerifyPaymentBatchResponse createVerifyPaymentBatchResponse() {
        return new VerifyPaymentBatchResponse();
    }

    /**
     * Create an instance of {@link AccountStatementRequest }
     * 
     */
    public AccountStatementRequest createAccountStatementRequest() {
        return new AccountStatementRequest();
    }

    /**
     * Create an instance of {@link AccountStatementPaging }
     * 
     */
    public AccountStatementPaging createAccountStatementPaging() {
        return new AccountStatementPaging();
    }

    /**
     * Create an instance of {@link AccountStatementResponse }
     * 
     */
    public AccountStatementResponse createAccountStatementResponse() {
        return new AccountStatementResponse();
    }

    /**
     * Create an instance of {@link AccountStatementRecordType }
     * 
     */
    public AccountStatementRecordType createAccountStatementRecordType() {
        return new AccountStatementRecordType();
    }

    /**
     * Create an instance of {@link FindAccountByIdRequest }
     * 
     */
    public FindAccountByIdRequest createFindAccountByIdRequest() {
        return new FindAccountByIdRequest();
    }

    /**
     * Create an instance of {@link FindAccountByIdResponse }
     * 
     */
    public FindAccountByIdResponse createFindAccountByIdResponse() {
        return new FindAccountByIdResponse();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link FindAccountByAliasRequest }
     * 
     */
    public FindAccountByAliasRequest createFindAccountByAliasRequest() {
        return new FindAccountByAliasRequest();
    }

    /**
     * Create an instance of {@link FindAccountByAliasResponse }
     * 
     */
    public FindAccountByAliasResponse createFindAccountByAliasResponse() {
        return new FindAccountByAliasResponse();
    }

    /**
     * Create an instance of {@link FindAccountsListRequest }
     * 
     */
    public FindAccountsListRequest createFindAccountsListRequest() {
        return new FindAccountsListRequest();
    }

    /**
     * Create an instance of {@link FindAccountsListResponse }
     * 
     */
    public FindAccountsListResponse createFindAccountsListResponse() {
        return new FindAccountsListResponse();
    }

    /**
     * Create an instance of {@link GetAccountPaymentPasswordChallengeRequest }
     * 
     */
    public GetAccountPaymentPasswordChallengeRequest createGetAccountPaymentPasswordChallengeRequest() {
        return new GetAccountPaymentPasswordChallengeRequest();
    }

    /**
     * Create an instance of {@link GetAccountPaymentPasswordChallengeResponse }
     * 
     */
    public GetAccountPaymentPasswordChallengeResponse createGetAccountPaymentPasswordChallengeResponse() {
        return new GetAccountPaymentPasswordChallengeResponse();
    }

    /**
     * Create an instance of {@link CreateAccountRequest }
     * 
     */
    public CreateAccountRequest createCreateAccountRequest() {
        return new CreateAccountRequest();
    }

    /**
     * Create an instance of {@link EditAccountRequest }
     * 
     */
    public EditAccountRequest createEditAccountRequest() {
        return new EditAccountRequest();
    }

    /**
     * Create an instance of {@link EditAccountResponse }
     * 
     */
    public EditAccountResponse createEditAccountResponse() {
        return new EditAccountResponse();
    }

    /**
     * Create an instance of {@link BlockAccountRequest }
     * 
     */
    public BlockAccountRequest createBlockAccountRequest() {
        return new BlockAccountRequest();
    }

    /**
     * Create an instance of {@link BlockAccountResponse }
     * 
     */
    public BlockAccountResponse createBlockAccountResponse() {
        return new BlockAccountResponse();
    }

    /**
     * Create an instance of {@link UnblockAccountRequest }
     * 
     */
    public UnblockAccountRequest createUnblockAccountRequest() {
        return new UnblockAccountRequest();
    }

    /**
     * Create an instance of {@link PaymentPassword }
     * 
     */
    public PaymentPassword createPaymentPassword() {
        return new PaymentPassword();
    }

    /**
     * Create an instance of {@link UnblockAccountResponse }
     * 
     */
    public UnblockAccountResponse createUnblockAccountResponse() {
        return new UnblockAccountResponse();
    }

    /**
     * Create an instance of {@link GetOperationDetailsByIdResponse }
     * 
     */
    public GetOperationDetailsByIdResponse createGetOperationDetailsByIdResponse() {
        return new GetOperationDetailsByIdResponse();
    }

    /**
     * Create an instance of {@link FindOperationsListByCTIDRequest }
     * 
     */
    public FindOperationsListByCTIDRequest createFindOperationsListByCTIDRequest() {
        return new FindOperationsListByCTIDRequest();
    }

    /**
     * Create an instance of {@link Pager }
     * 
     */
    public Pager createPager() {
        return new Pager();
    }

    /**
     * Create an instance of {@link FindOperationsListByCTIDResponse }
     * 
     */
    public FindOperationsListByCTIDResponse createFindOperationsListByCTIDResponse() {
        return new FindOperationsListByCTIDResponse();
    }

    /**
     * Create an instance of {@link OperationInfoList }
     * 
     */
    public OperationInfoList createOperationInfoList() {
        return new OperationInfoList();
    }

    /**
     * Create an instance of {@link FindOperationsListRequest.Filter }
     * 
     */
    public FindOperationsListRequest.Filter createFindOperationsListRequestFilter() {
        return new FindOperationsListRequest.Filter();
    }

    /**
     * Create an instance of {@link FindOperationsListResponse }
     * 
     */
    public FindOperationsListResponse createFindOperationsListResponse() {
        return new FindOperationsListResponse();
    }

    /**
     * Create an instance of {@link FindLastOperationsListRequest }
     * 
     */
    public FindLastOperationsListRequest createFindLastOperationsListRequest() {
        return new FindLastOperationsListRequest();
    }

    /**
     * Create an instance of {@link FindLastOperationsListResponse }
     * 
     */
    public FindLastOperationsListResponse createFindLastOperationsListResponse() {
        return new FindLastOperationsListResponse();
    }

    /**
     * Create an instance of {@link GetFinancialFlowsListRequest }
     * 
     */
    public GetFinancialFlowsListRequest createGetFinancialFlowsListRequest() {
        return new GetFinancialFlowsListRequest();
    }

    /**
     * Create an instance of {@link GetFinancialFlowsListResponse.FinancialFlow }
     * 
     */
    public GetFinancialFlowsListResponse.FinancialFlow createGetFinancialFlowsListResponseFinancialFlow() {
        return new GetFinancialFlowsListResponse.FinancialFlow();
    }

    /**
     * Create an instance of {@link GetTurnoverListRequest }
     * 
     */
    public GetTurnoverListRequest createGetTurnoverListRequest() {
        return new GetTurnoverListRequest();
    }

    /**
     * Create an instance of {@link GetTurnoverListResponse.Turnover }
     * 
     */
    public GetTurnoverListResponse.Turnover createGetTurnoverListResponseTurnover() {
        return new GetTurnoverListResponse.Turnover();
    }

    /**
     * Create an instance of {@link FindProfileInfoByAccountIdRequest }
     * 
     */
    public FindProfileInfoByAccountIdRequest createFindProfileInfoByAccountIdRequest() {
        return new FindProfileInfoByAccountIdRequest();
    }

    /**
     * Create an instance of {@link FindProfileInfoByAccountIdResponse }
     * 
     */
    public FindProfileInfoByAccountIdResponse createFindProfileInfoByAccountIdResponse() {
        return new FindProfileInfoByAccountIdResponse();
    }

    /**
     * Create an instance of {@link ru.moneta.schemas.messages.Profile }
     * 
     */
    public ru.moneta.schemas.messages.Profile createProfile() {
        return new ru.moneta.schemas.messages.Profile();
    }

    /**
     * Create an instance of {@link CreateProfileRequest }
     * 
     */
    public CreateProfileRequest createCreateProfileRequest() {
        return new CreateProfileRequest();
    }

    /**
     * Create an instance of {@link CheckProfileRequest }
     * 
     */
    public CheckProfileRequest createCheckProfileRequest() {
        return new CheckProfileRequest();
    }

    /**
     * Create an instance of {@link EditProfileRequest }
     * 
     */
    public EditProfileRequest createEditProfileRequest() {
        return new EditProfileRequest();
    }

    /**
     * Create an instance of {@link EditProfileResponse }
     * 
     */
    public EditProfileResponse createEditProfileResponse() {
        return new EditProfileResponse();
    }

    /**
     * Create an instance of {@link GetProfileInfoRequest }
     * 
     */
    public GetProfileInfoRequest createGetProfileInfoRequest() {
        return new GetProfileInfoRequest();
    }

    /**
     * Create an instance of {@link GetProfileInfoResponse }
     * 
     */
    public GetProfileInfoResponse createGetProfileInfoResponse() {
        return new GetProfileInfoResponse();
    }

    /**
     * Create an instance of {@link FindProfileInfoRequest.Filter }
     * 
     */
    public FindProfileInfoRequest.Filter createFindProfileInfoRequestFilter() {
        return new FindProfileInfoRequest.Filter();
    }

    /**
     * Create an instance of {@link FindProfileInfoResponse }
     * 
     */
    public FindProfileInfoResponse createFindProfileInfoResponse() {
        return new FindProfileInfoResponse();
    }

    /**
     * Create an instance of {@link FindContractsRequest }
     * 
     */
    public FindContractsRequest createFindContractsRequest() {
        return new FindContractsRequest();
    }

    /**
     * Create an instance of {@link FindContractsResponse }
     * 
     */
    public FindContractsResponse createFindContractsResponse() {
        return new FindContractsResponse();
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link FindBankAccountsRequest }
     * 
     */
    public FindBankAccountsRequest createFindBankAccountsRequest() {
        return new FindBankAccountsRequest();
    }

    /**
     * Create an instance of {@link FindBankAccountsResponse }
     * 
     */
    public FindBankAccountsResponse createFindBankAccountsResponse() {
        return new FindBankAccountsResponse();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link CreateBankAccountRequest }
     * 
     */
    public CreateBankAccountRequest createCreateBankAccountRequest() {
        return new CreateBankAccountRequest();
    }

    /**
     * Create an instance of {@link CreateBankAccountResponse }
     * 
     */
    public CreateBankAccountResponse createCreateBankAccountResponse() {
        return new CreateBankAccountResponse();
    }

    /**
     * Create an instance of {@link EditBankAccountRequest }
     * 
     */
    public EditBankAccountRequest createEditBankAccountRequest() {
        return new EditBankAccountRequest();
    }

    /**
     * Create an instance of {@link EditBankAccountResponse }
     * 
     */
    public EditBankAccountResponse createEditBankAccountResponse() {
        return new EditBankAccountResponse();
    }

    /**
     * Create an instance of {@link FindLegalInformationRequest }
     * 
     */
    public FindLegalInformationRequest createFindLegalInformationRequest() {
        return new FindLegalInformationRequest();
    }

    /**
     * Create an instance of {@link FindLegalInformationResponse }
     * 
     */
    public FindLegalInformationResponse createFindLegalInformationResponse() {
        return new FindLegalInformationResponse();
    }

    /**
     * Create an instance of {@link LegalInformation }
     * 
     */
    public LegalInformation createLegalInformation() {
        return new LegalInformation();
    }

    /**
     * Create an instance of {@link FindProfileDocumentFilesRequest }
     * 
     */
    public FindProfileDocumentFilesRequest createFindProfileDocumentFilesRequest() {
        return new FindProfileDocumentFilesRequest();
    }

    /**
     * Create an instance of {@link FindProfileDocumentFilesResponse }
     * 
     */
    public FindProfileDocumentFilesResponse createFindProfileDocumentFilesResponse() {
        return new FindProfileDocumentFilesResponse();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link UploadProfileDocumentFileRequest }
     * 
     */
    public UploadProfileDocumentFileRequest createUploadProfileDocumentFileRequest() {
        return new UploadProfileDocumentFileRequest();
    }

    /**
     * Create an instance of {@link UploadProfileDocumentFileResponse }
     * 
     */
    public UploadProfileDocumentFileResponse createUploadProfileDocumentFileResponse() {
        return new UploadProfileDocumentFileResponse();
    }

    /**
     * Create an instance of {@link FindProfileDocumentsRequest }
     * 
     */
    public FindProfileDocumentsRequest createFindProfileDocumentsRequest() {
        return new FindProfileDocumentsRequest();
    }

    /**
     * Create an instance of {@link FindProfileDocumentsResponse }
     * 
     */
    public FindProfileDocumentsResponse createFindProfileDocumentsResponse() {
        return new FindProfileDocumentsResponse();
    }

    /**
     * Create an instance of {@link ru.moneta.schemas.messages.Document }
     * 
     */
    public ru.moneta.schemas.messages.Document createDocument() {
        return new ru.moneta.schemas.messages.Document();
    }

    /**
     * Create an instance of {@link CreateProfileDocumentRequest }
     * 
     */
    public CreateProfileDocumentRequest createCreateProfileDocumentRequest() {
        return new CreateProfileDocumentRequest();
    }

    /**
     * Create an instance of {@link CreateProfileDocumentResponse }
     * 
     */
    public CreateProfileDocumentResponse createCreateProfileDocumentResponse() {
        return new CreateProfileDocumentResponse();
    }

    /**
     * Create an instance of {@link EditProfileDocumentRequest }
     * 
     */
    public EditProfileDocumentRequest createEditProfileDocumentRequest() {
        return new EditProfileDocumentRequest();
    }

    /**
     * Create an instance of {@link EditProfileDocumentResponse }
     * 
     */
    public EditProfileDocumentResponse createEditProfileDocumentResponse() {
        return new EditProfileDocumentResponse();
    }

    /**
     * Create an instance of {@link FindReportsRequest }
     * 
     */
    public FindReportsRequest createFindReportsRequest() {
        return new FindReportsRequest();
    }

    /**
     * Create an instance of {@link FindReportsResponse }
     * 
     */
    public FindReportsResponse createFindReportsResponse() {
        return new FindReportsResponse();
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link FindAccountRelationsRequest }
     * 
     */
    public FindAccountRelationsRequest createFindAccountRelationsRequest() {
        return new FindAccountRelationsRequest();
    }

    /**
     * Create an instance of {@link FindAccountRelationsResponse }
     * 
     */
    public FindAccountRelationsResponse createFindAccountRelationsResponse() {
        return new FindAccountRelationsResponse();
    }

    /**
     * Create an instance of {@link AccountRelation }
     * 
     */
    public AccountRelation createAccountRelation() {
        return new AccountRelation();
    }

    /**
     * Create an instance of {@link GetAccountRelationRequest }
     * 
     */
    public GetAccountRelationRequest createGetAccountRelationRequest() {
        return new GetAccountRelationRequest();
    }

    /**
     * Create an instance of {@link GetAccountRelationResponse }
     * 
     */
    public GetAccountRelationResponse createGetAccountRelationResponse() {
        return new GetAccountRelationResponse();
    }

    /**
     * Create an instance of {@link SaveAccountRelationRequest }
     * 
     */
    public SaveAccountRelationRequest createSaveAccountRelationRequest() {
        return new SaveAccountRelationRequest();
    }

    /**
     * Create an instance of {@link SaveAccountRelationResponse }
     * 
     */
    public SaveAccountRelationResponse createSaveAccountRelationResponse() {
        return new SaveAccountRelationResponse();
    }

    /**
     * Create an instance of {@link DeleteAccountRelationRequest }
     * 
     */
    public DeleteAccountRelationRequest createDeleteAccountRelationRequest() {
        return new DeleteAccountRelationRequest();
    }

    /**
     * Create an instance of {@link DeleteAccountRelationResponse }
     * 
     */
    public DeleteAccountRelationResponse createDeleteAccountRelationResponse() {
        return new DeleteAccountRelationResponse();
    }

    /**
     * Create an instance of {@link GetPersonificationCodeRequest }
     * 
     */
    public GetPersonificationCodeRequest createGetPersonificationCodeRequest() {
        return new GetPersonificationCodeRequest();
    }

    /**
     * Create an instance of {@link GetPersonificationCodeResponse }
     * 
     */
    public GetPersonificationCodeResponse createGetPersonificationCodeResponse() {
        return new GetPersonificationCodeResponse();
    }

    /**
     * Create an instance of {@link VerifyPersonificationCodeRequest }
     * 
     */
    public VerifyPersonificationCodeRequest createVerifyPersonificationCodeRequest() {
        return new VerifyPersonificationCodeRequest();
    }

    /**
     * Create an instance of {@link VerifyPersonificationCodeResponse }
     * 
     */
    public VerifyPersonificationCodeResponse createVerifyPersonificationCodeResponse() {
        return new VerifyPersonificationCodeResponse();
    }

    /**
     * Create an instance of {@link PersonalInformation }
     * 
     */
    public PersonalInformation createPersonalInformation() {
        return new PersonalInformation();
    }

    /**
     * Create an instance of {@link ConfirmPersonificationRequest }
     * 
     */
    public ConfirmPersonificationRequest createConfirmPersonificationRequest() {
        return new ConfirmPersonificationRequest();
    }

    /**
     * Create an instance of {@link ConfirmPersonificationResponse }
     * 
     */
    public ConfirmPersonificationResponse createConfirmPersonificationResponse() {
        return new ConfirmPersonificationResponse();
    }

    /**
     * Create an instance of {@link AccessTokenListRequest }
     * 
     */
    public AccessTokenListRequest createAccessTokenListRequest() {
        return new AccessTokenListRequest();
    }

    /**
     * Create an instance of {@link AccessTokenListResponse.AccessToken }
     * 
     */
    public AccessTokenListResponse.AccessToken createAccessTokenListResponseAccessToken() {
        return new AccessTokenListResponse.AccessToken();
    }

    /**
     * Create an instance of {@link ApprovePhoneSendConfirmationRequest }
     * 
     */
    public ApprovePhoneSendConfirmationRequest createApprovePhoneSendConfirmationRequest() {
        return new ApprovePhoneSendConfirmationRequest();
    }

    /**
     * Create an instance of {@link ApprovePhoneSendConfirmationResponse }
     * 
     */
    public ApprovePhoneSendConfirmationResponse createApprovePhoneSendConfirmationResponse() {
        return new ApprovePhoneSendConfirmationResponse();
    }

    /**
     * Create an instance of {@link ApprovePhoneApplyCodeRequest }
     * 
     */
    public ApprovePhoneApplyCodeRequest createApprovePhoneApplyCodeRequest() {
        return new ApprovePhoneApplyCodeRequest();
    }

    /**
     * Create an instance of {@link ApprovePhoneApplyCodeResponse }
     * 
     */
    public ApprovePhoneApplyCodeResponse createApprovePhoneApplyCodeResponse() {
        return new ApprovePhoneApplyCodeResponse();
    }

    /**
     * Create an instance of {@link SimplifiedIdentificationRequest }
     * 
     */
    public SimplifiedIdentificationRequest createSimplifiedIdentificationRequest() {
        return new SimplifiedIdentificationRequest();
    }

    /**
     * Create an instance of {@link SimplifiedIdentificationResponse }
     * 
     */
    public SimplifiedIdentificationResponse createSimplifiedIdentificationResponse() {
        return new SimplifiedIdentificationResponse();
    }

    /**
     * Create an instance of {@link SecureDataRequest }
     * 
     */
    public SecureDataRequest createSecureDataRequest() {
        return new SecureDataRequest();
    }

    /**
     * Create an instance of {@link SecureDataResponse }
     * 
     */
    public SecureDataResponse createSecureDataResponse() {
        return new SecureDataResponse();
    }

    /**
     * Create an instance of {@link SecureDataStatusRequest }
     * 
     */
    public SecureDataStatusRequest createSecureDataStatusRequest() {
        return new SecureDataStatusRequest();
    }

    /**
     * Create an instance of {@link SecureDataStatusResponse }
     * 
     */
    public SecureDataStatusResponse createSecureDataStatusResponse() {
        return new SecureDataStatusResponse();
    }

    /**
     * Create an instance of {@link CreateOperationTemplateRequest }
     * 
     */
    public CreateOperationTemplateRequest createCreateOperationTemplateRequest() {
        return new CreateOperationTemplateRequest();
    }

    /**
     * Create an instance of {@link OperationTemplate }
     * 
     */
    public OperationTemplate createOperationTemplate() {
        return new OperationTemplate();
    }

    /**
     * Create an instance of {@link CommonOperationTemplateParameters }
     * 
     */
    public CommonOperationTemplateParameters createCommonOperationTemplateParameters() {
        return new CommonOperationTemplateParameters();
    }

    /**
     * Create an instance of {@link RegularOperationTemplateParameters }
     * 
     */
    public RegularOperationTemplateParameters createRegularOperationTemplateParameters() {
        return new RegularOperationTemplateParameters();
    }

    /**
     * Create an instance of {@link DirectDebitOperationTemplateParameters }
     * 
     */
    public DirectDebitOperationTemplateParameters createDirectDebitOperationTemplateParameters() {
        return new DirectDebitOperationTemplateParameters();
    }

    /**
     * Create an instance of {@link CreateOperationTemplateResponse }
     * 
     */
    public CreateOperationTemplateResponse createCreateOperationTemplateResponse() {
        return new CreateOperationTemplateResponse();
    }

    /**
     * Create an instance of {@link EditOperationTemplateRequest }
     * 
     */
    public EditOperationTemplateRequest createEditOperationTemplateRequest() {
        return new EditOperationTemplateRequest();
    }

    /**
     * Create an instance of {@link EditOperationTemplateResponse }
     * 
     */
    public EditOperationTemplateResponse createEditOperationTemplateResponse() {
        return new EditOperationTemplateResponse();
    }

    /**
     * Create an instance of {@link FindOperationTemplatesRequest }
     * 
     */
    public FindOperationTemplatesRequest createFindOperationTemplatesRequest() {
        return new FindOperationTemplatesRequest();
    }

    /**
     * Create an instance of {@link FindOperationTemplatesResponse }
     * 
     */
    public FindOperationTemplatesResponse createFindOperationTemplatesResponse() {
        return new FindOperationTemplatesResponse();
    }

    /**
     * Create an instance of {@link DeleteOperationTemplateRequest }
     * 
     */
    public DeleteOperationTemplateRequest createDeleteOperationTemplateRequest() {
        return new DeleteOperationTemplateRequest();
    }

    /**
     * Create an instance of {@link DeleteOperationTemplateResponse }
     * 
     */
    public DeleteOperationTemplateResponse createDeleteOperationTemplateResponse() {
        return new DeleteOperationTemplateResponse();
    }

    /**
     * Create an instance of {@link AsyncRequest }
     * 
     */
    public AsyncRequest createAsyncRequest() {
        return new AsyncRequest();
    }

    /**
     * Create an instance of {@link PingRequest }
     * 
     */
    public PingRequest createPingRequest() {
        return new PingRequest();
    }

    /**
     * Create an instance of {@link AsyncResponse }
     * 
     */
    public AsyncResponse createAsyncResponse() {
        return new AsyncResponse();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link InfoUrl }
     * 
     */
    public InfoUrl createInfoUrl() {
        return new InfoUrl();
    }

    /**
     * Create an instance of {@link ReferenceData }
     * 
     */
    public ReferenceData createReferenceData() {
        return new ReferenceData();
    }

    /**
     * Create an instance of {@link InfoTariff }
     * 
     */
    public InfoTariff createInfoTariff() {
        return new InfoTariff();
    }

    /**
     * Create an instance of {@link AccountAccessInfo }
     * 
     */
    public AccountAccessInfo createAccountAccessInfo() {
        return new AccountAccessInfo();
    }

    /**
     * Create an instance of {@link ReportInstance }
     * 
     */
    public ReportInstance createReportInstance() {
        return new ReportInstance();
    }

    /**
     * Create an instance of {@link OperationTemplateAmountInfo }
     * 
     */
    public OperationTemplateAmountInfo createOperationTemplateAmountInfo() {
        return new OperationTemplateAmountInfo();
    }

    /**
     * Create an instance of {@link OperationTemplateAmount }
     * 
     */
    public OperationTemplateAmount createOperationTemplateAmount() {
        return new OperationTemplateAmount();
    }

    /**
     * Create an instance of {@link OperationTemplateAmountRange }
     * 
     */
    public OperationTemplateAmountRange createOperationTemplateAmountRange() {
        return new OperationTemplateAmountRange();
    }

    /**
     * Create an instance of {@link OperationTemplateAmountRest }
     * 
     */
    public OperationTemplateAmountRest createOperationTemplateAmountRest() {
        return new OperationTemplateAmountRest();
    }

    /**
     * Create an instance of {@link OperationTemplateTimeInfo }
     * 
     */
    public OperationTemplateTimeInfo createOperationTemplateTimeInfo() {
        return new OperationTemplateTimeInfo();
    }

    /**
     * Create an instance of {@link OperationTemplateReminderInfo }
     * 
     */
    public OperationTemplateReminderInfo createOperationTemplateReminderInfo() {
        return new OperationTemplateReminderInfo();
    }

    /**
     * Create an instance of {@link ProfileNotificationSelection }
     * 
     */
    public ProfileNotificationSelection createProfileNotificationSelection() {
        return new ProfileNotificationSelection();
    }

    /**
     * Create an instance of {@link ProfileNotification }
     * 
     */
    public ProfileNotification createProfileNotification() {
        return new ProfileNotification();
    }

    /**
     * Create an instance of {@link ProfileNotificationFlag }
     * 
     */
    public ProfileNotificationFlag createProfileNotificationFlag() {
        return new ProfileNotificationFlag();
    }

    /**
     * Create an instance of {@link CheckProfileResponse.RequestInfo.Profile }
     * 
     */
    public CheckProfileResponse.RequestInfo.Profile createCheckProfileResponseRequestInfoProfile() {
        return new CheckProfileResponse.RequestInfo.Profile();
    }

    /**
     * Create an instance of {@link CheckProfileResponse.RequestInfo.Document }
     * 
     */
    public CheckProfileResponse.RequestInfo.Document createCheckProfileResponseRequestInfoDocument() {
        return new CheckProfileResponse.RequestInfo.Document();
    }

    /**
     * Create an instance of {@link CheckProfileResponse.RequestInfo.Bank }
     * 
     */
    public CheckProfileResponse.RequestInfo.Bank createCheckProfileResponseRequestInfoBank() {
        return new CheckProfileResponse.RequestInfo.Bank();
    }

    /**
     * Create an instance of {@link CheckProfileResponse.RequestInfo.Juridical }
     * 
     */
    public CheckProfileResponse.RequestInfo.Juridical createCheckProfileResponseRequestInfoJuridical() {
        return new CheckProfileResponse.RequestInfo.Juridical();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.moneta.ru/schemas/messages.xsd", name = "CreateAccountResponse")
    public JAXBElement<Long> createCreateAccountResponse(Long value) {
        return new JAXBElement<Long>(_CreateAccountResponse_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.moneta.ru/schemas/messages.xsd", name = "GetOperationDetailsByIdRequest")
    public JAXBElement<Long> createGetOperationDetailsByIdRequest(Long value) {
        return new JAXBElement<Long>(_GetOperationDetailsByIdRequest_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.moneta.ru/schemas/messages.xsd", name = "CreateProfileResponse")
    public JAXBElement<Long> createCreateProfileResponse(Long value) {
        return new JAXBElement<Long>(_CreateProfileResponse_QNAME, Long.class, null, value);
    }

}
