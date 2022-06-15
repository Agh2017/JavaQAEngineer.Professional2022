package ru.moneta.services_wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2022-06-15T22:49:25.235+03:00
 * Generated source version: 3.3.4
 *
 */
@WebService(targetNamespace = "http://www.moneta.ru/services.wsdl", name = "Messages")
@XmlSeeAlso({ru.moneta.schemas.messages.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Messages {

    @WebMethod(operationName = "EditAccount")
    @WebResult(name = "EditAccountResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "EditAccountResponse")
    public ru.moneta.schemas.messages.EditAccountResponse editAccount(

        @WebParam(partName = "EditAccountRequest", name = "EditAccountRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.EditAccountRequest editAccountRequest
    );

    @WebMethod(operationName = "FindReports")
    @WebResult(name = "FindReportsResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindReportsResponse")
    public ru.moneta.schemas.messages.FindReportsResponse findReports(

        @WebParam(partName = "FindReportsRequest", name = "FindReportsRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindReportsRequest findReportsRequest
    );

    @WebMethod(operationName = "VerifyPaymentBatch")
    @WebResult(name = "VerifyPaymentBatchResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "VerifyPaymentBatchResponse")
    public ru.moneta.schemas.messages.VerifyPaymentBatchResponse verifyPaymentBatch(

        @WebParam(partName = "VerifyPaymentBatchRequest", name = "VerifyPaymentBatchRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.VerifyPaymentBatchRequest verifyPaymentBatchRequest
    );

    @WebMethod(operationName = "FindProfileDocuments")
    @WebResult(name = "FindProfileDocumentsResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindProfileDocumentsResponse")
    public ru.moneta.schemas.messages.FindProfileDocumentsResponse findProfileDocuments(

        @WebParam(partName = "FindProfileDocumentsRequest", name = "FindProfileDocumentsRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindProfileDocumentsRequest findProfileDocumentsRequest
    );

    @WebMethod(operationName = "CreateBankAccount")
    @WebResult(name = "CreateBankAccountResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "CreateBankAccountResponse")
    public ru.moneta.schemas.messages.CreateBankAccountResponse createBankAccount(

        @WebParam(partName = "CreateBankAccountRequest", name = "CreateBankAccountRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.CreateBankAccountRequest createBankAccountRequest
    );

    @WebMethod(operationName = "BlockAccount")
    @WebResult(name = "BlockAccountResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "BlockAccountResponse")
    public ru.moneta.schemas.messages.BlockAccountResponse blockAccount(

        @WebParam(partName = "BlockAccountRequest", name = "BlockAccountRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.BlockAccountRequest blockAccountRequest
    );

    @WebMethod(operationName = "EditProfileDocument")
    @WebResult(name = "EditProfileDocumentResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "EditProfileDocumentResponse")
    public ru.moneta.schemas.messages.EditProfileDocumentResponse editProfileDocument(

        @WebParam(partName = "EditProfileDocumentRequest", name = "EditProfileDocumentRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.EditProfileDocumentRequest editProfileDocumentRequest
    );

    @WebMethod(operationName = "FindOperationTemplates")
    @WebResult(name = "FindOperationTemplatesResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindOperationTemplatesResponse")
    public ru.moneta.schemas.messages.FindOperationTemplatesResponse findOperationTemplates(

        @WebParam(partName = "FindOperationTemplatesRequest", name = "FindOperationTemplatesRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindOperationTemplatesRequest findOperationTemplatesRequest
    );

    @WebMethod(operationName = "GetPersonificationCode")
    @WebResult(name = "GetPersonificationCodeResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "GetPersonificationCodeResponse")
    public ru.moneta.schemas.messages.GetPersonificationCodeResponse getPersonificationCode(

        @WebParam(partName = "GetPersonificationCodeRequest", name = "GetPersonificationCodeRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.GetPersonificationCodeRequest getPersonificationCodeRequest
    );

    @WebMethod(operationName = "PaymentSystemInfo")
    @WebResult(name = "PaymentSystemInfoResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "PaymentSystemInfoResponse")
    public ru.moneta.schemas.messages.PaymentSystemInfoResponse paymentSystemInfo(

        @WebParam(partName = "PaymentSystemInfoRequest", name = "PaymentSystemInfoRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.PaymentSystemInfoRequest paymentSystemInfoRequest
    );

    @WebMethod(operationName = "AccessTokenList")
    @WebResult(name = "AccessTokenListResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "AccessTokenListResponse")
    public ru.moneta.schemas.messages.AccessTokenListResponse accessTokenList(

        @WebParam(partName = "AccessTokenListRequest", name = "AccessTokenListRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.AccessTokenListRequest accessTokenListRequest
    );

    @WebMethod(operationName = "FindProfileInfoByAccountId")
    @WebResult(name = "FindProfileInfoByAccountIdResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindProfileInfoByAccountIdResponse")
    public ru.moneta.schemas.messages.FindProfileInfoByAccountIdResponse findProfileInfoByAccountId(

        @WebParam(partName = "FindProfileInfoByAccountIdRequest", name = "FindProfileInfoByAccountIdRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindProfileInfoByAccountIdRequest findProfileInfoByAccountIdRequest
    );

    @WebMethod(operationName = "FindBankAccounts")
    @WebResult(name = "FindBankAccountsResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindBankAccountsResponse")
    public ru.moneta.schemas.messages.FindBankAccountsResponse findBankAccounts(

        @WebParam(partName = "FindBankAccountsRequest", name = "FindBankAccountsRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindBankAccountsRequest findBankAccountsRequest
    );

    @WebMethod(operationName = "FindContracts")
    @WebResult(name = "FindContractsResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindContractsResponse")
    public ru.moneta.schemas.messages.FindContractsResponse findContracts(

        @WebParam(partName = "FindContractsRequest", name = "FindContractsRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindContractsRequest findContractsRequest
    );

    @WebMethod(operationName = "VerifyTransfer")
    @WebResult(name = "VerifyTransferResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "VerifyTransferResponse")
    public ru.moneta.schemas.messages.VerifyTransferResponse verifyTransfer(

        @WebParam(partName = "VerifyTransferRequest", name = "VerifyTransferRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.VerifyTransferRequest verifyTransferRequest
    );

    @WebMethod(operationName = "GetTurnoverList")
    @WebResult(name = "GetTurnoverListResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "GetTurnoverListResponse")
    public ru.moneta.schemas.messages.GetTurnoverListResponse getTurnoverList(

        @WebParam(partName = "GetTurnoverListRequest", name = "GetTurnoverListRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.GetTurnoverListRequest getTurnoverListRequest
    );

    @WebMethod(operationName = "GetProfileInfo")
    @WebResult(name = "GetProfileInfoResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "GetProfileInfoResponse")
    public ru.moneta.schemas.messages.GetProfileInfoResponse getProfileInfo(

        @WebParam(partName = "GetProfileInfoRequest", name = "GetProfileInfoRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.GetProfileInfoRequest getProfileInfoRequest
    );

    @WebMethod(operationName = "ConfirmTransaction")
    @WebResult(name = "ConfirmTransactionResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "ConfirmTransactionResponse")
    public ru.moneta.schemas.messages.ConfirmTransactionResponse confirmTransaction(

        @WebParam(partName = "ConfirmTransactionRequest", name = "ConfirmTransactionRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.ConfirmTransactionRequest confirmTransactionRequest
    );

    @WebMethod(operationName = "FindLastOperationsList")
    @WebResult(name = "FindLastOperationsListResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindLastOperationsListResponse")
    public ru.moneta.schemas.messages.FindLastOperationsListResponse findLastOperationsList(

        @WebParam(partName = "FindLastOperationsListRequest", name = "FindLastOperationsListRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindLastOperationsListRequest findLastOperationsListRequest
    );

    @WebMethod(operationName = "ApprovePhoneSendConfirmation")
    @WebResult(name = "ApprovePhoneSendConfirmationResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "ApprovePhoneSendConfirmationResponse")
    public ru.moneta.schemas.messages.ApprovePhoneSendConfirmationResponse approvePhoneSendConfirmation(

        @WebParam(partName = "ApprovePhoneSendConfirmationRequest", name = "ApprovePhoneSendConfirmationRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.ApprovePhoneSendConfirmationRequest approvePhoneSendConfirmationRequest
    );

    @WebMethod(operationName = "SecureDataStatus")
    @WebResult(name = "SecureDataStatusResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "SecureDataStatusResponse")
    public ru.moneta.schemas.messages.SecureDataStatusResponse secureDataStatus(

        @WebParam(partName = "SecureDataStatusRequest", name = "SecureDataStatusRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.SecureDataStatusRequest secureDataStatusRequest
    );

    @WebMethod(operationName = "GetFinancialFlowsList")
    @WebResult(name = "GetFinancialFlowsListResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "GetFinancialFlowsListResponse")
    public ru.moneta.schemas.messages.GetFinancialFlowsListResponse getFinancialFlowsList(

        @WebParam(partName = "GetFinancialFlowsListRequest", name = "GetFinancialFlowsListRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.GetFinancialFlowsListRequest getFinancialFlowsListRequest
    );

    @WebMethod(operationName = "CreateProfile")
    @WebResult(name = "CreateProfileResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "CreateProfileResponse")
    public long createProfile(

        @WebParam(partName = "CreateProfileRequest", name = "CreateProfileRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.CreateProfileRequest createProfileRequest
    );

    @WebMethod(operationName = "FindProfileInfo")
    @WebResult(name = "FindProfileInfoResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindProfileInfoResponse")
    public ru.moneta.schemas.messages.FindProfileInfoResponse findProfileInfo(

        @WebParam(partName = "FindProfileInfoRequest", name = "FindProfileInfoRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindProfileInfoRequest findProfileInfoRequest
    );

    @WebMethod(operationName = "PaymentBatch")
    @WebResult(name = "PaymentBatchResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "PaymentBatchResponse")
    public ru.moneta.schemas.messages.PaymentBatchResponse paymentBatch(

        @WebParam(partName = "PaymentBatchRequest", name = "PaymentBatchRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.PaymentBatchRequest paymentBatchRequest
    );

    @WebMethod(operationName = "UnblockAccount")
    @WebResult(name = "UnblockAccountResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "UnblockAccountResponse")
    public ru.moneta.schemas.messages.UnblockAccountResponse unblockAccount(

        @WebParam(partName = "UnblockAccountRequest", name = "UnblockAccountRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.UnblockAccountRequest unblockAccountRequest
    );

    @WebMethod(operationName = "DeleteAccountRelation")
    @WebResult(name = "DeleteAccountRelationResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "DeleteAccountRelationResponse")
    public ru.moneta.schemas.messages.DeleteAccountRelationResponse deleteAccountRelation(

        @WebParam(partName = "DeleteAccountRelationRequest", name = "DeleteAccountRelationRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.DeleteAccountRelationRequest deleteAccountRelationRequest
    );

    @WebMethod(operationName = "UploadProfileDocumentFile")
    @WebResult(name = "UploadProfileDocumentFileResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "UploadProfileDocumentFileResponse")
    public ru.moneta.schemas.messages.UploadProfileDocumentFileResponse uploadProfileDocumentFile(

        @WebParam(partName = "UploadProfileDocumentFileRequest", name = "UploadProfileDocumentFileRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.UploadProfileDocumentFileRequest uploadProfileDocumentFileRequest
    );

    @WebMethod(operationName = "FindAccountByAlias")
    @WebResult(name = "FindAccountByAliasResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindAccountByAliasResponse")
    public ru.moneta.schemas.messages.FindAccountByAliasResponse findAccountByAlias(

        @WebParam(partName = "FindAccountByAliasRequest", name = "FindAccountByAliasRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindAccountByAliasRequest findAccountByAliasRequest
    );

    @WebMethod(operationName = "Chargeback")
    @WebResult(name = "ChargebackResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "ChargebackResponse")
    public ru.moneta.schemas.messages.ChargebackResponse chargeback(

        @WebParam(partName = "ChargebackRequest", name = "ChargebackRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.ChargebackRequest chargebackRequest
    );

    @WebMethod(operationName = "ConfirmTransactionBatch")
    @WebResult(name = "ConfirmTransactionBatchResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "ConfirmTransactionBatchResponse")
    public ru.moneta.schemas.messages.ConfirmTransactionBatchResponse confirmTransactionBatch(

        @WebParam(partName = "ConfirmTransactionBatchRequest", name = "ConfirmTransactionBatchRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.ConfirmTransactionBatchRequest confirmTransactionBatchRequest
    );

    @WebMethod(operationName = "CancelTransaction")
    @WebResult(name = "CancelTransactionResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "CancelTransactionResponse")
    public ru.moneta.schemas.messages.CancelTransactionResponse cancelTransaction(

        @WebParam(partName = "CancelTransactionRequest", name = "CancelTransactionRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.CancelTransactionRequest cancelTransactionRequest
    );

    @WebMethod(operationName = "FindOperationsListByCTID")
    @WebResult(name = "FindOperationsListByCTIDResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindOperationsListByCTIDResponse")
    public ru.moneta.schemas.messages.FindOperationsListByCTIDResponse findOperationsListByCTID(

        @WebParam(partName = "FindOperationsListByCTIDRequest", name = "FindOperationsListByCTIDRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindOperationsListByCTIDRequest findOperationsListByCTIDRequest
    );

    @WebMethod(operationName = "ConfirmPersonification")
    @WebResult(name = "ConfirmPersonificationResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "ConfirmPersonificationResponse")
    public ru.moneta.schemas.messages.ConfirmPersonificationResponse confirmPersonification(

        @WebParam(partName = "ConfirmPersonificationRequest", name = "ConfirmPersonificationRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.ConfirmPersonificationRequest confirmPersonificationRequest
    );

    @WebMethod(operationName = "ForecastTransaction")
    @WebResult(name = "ForecastTransactionResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "ForecastTransactionResponse")
    public ru.moneta.schemas.messages.ForecastTransactionResponse forecastTransaction(

        @WebParam(partName = "ForecastTransactionRequest", name = "ForecastTransactionRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.ForecastTransactionRequest forecastTransactionRequest
    );

    @WebMethod(operationName = "FindProfileDocumentFiles")
    @WebResult(name = "FindProfileDocumentFilesResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindProfileDocumentFilesResponse")
    public ru.moneta.schemas.messages.FindProfileDocumentFilesResponse findProfileDocumentFiles(

        @WebParam(partName = "FindProfileDocumentFilesRequest", name = "FindProfileDocumentFilesRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindProfileDocumentFilesRequest findProfileDocumentFilesRequest
    );

    @WebMethod(operationName = "GetAccountRelation")
    @WebResult(name = "GetAccountRelationResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "GetAccountRelationResponse")
    public ru.moneta.schemas.messages.GetAccountRelationResponse getAccountRelation(

        @WebParam(partName = "GetAccountRelationRequest", name = "GetAccountRelationRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.GetAccountRelationRequest getAccountRelationRequest
    );

    @WebMethod(operationName = "Async")
    @WebResult(name = "AsyncResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "AsyncResponse")
    public ru.moneta.schemas.messages.AsyncResponse async(

        @WebParam(partName = "AsyncRequest", name = "AsyncRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.AsyncRequest asyncRequest
    );

    @WebMethod(operationName = "EditBankAccount")
    @WebResult(name = "EditBankAccountResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "EditBankAccountResponse")
    public ru.moneta.schemas.messages.EditBankAccountResponse editBankAccount(

        @WebParam(partName = "EditBankAccountRequest", name = "EditBankAccountRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.EditBankAccountRequest editBankAccountRequest
    );

    @WebMethod(operationName = "AuthoriseTransactionBatch")
    @WebResult(name = "AuthoriseTransactionBatchResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "AuthoriseTransactionBatchResponse")
    public ru.moneta.schemas.messages.AuthoriseTransactionBatchResponse authoriseTransactionBatch(

        @WebParam(partName = "AuthoriseTransactionBatchRequest", name = "AuthoriseTransactionBatchRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.AuthoriseTransactionBatchRequest authoriseTransactionBatchRequest
    );

    @WebMethod(operationName = "CheckProfile")
    @WebResult(name = "CheckProfileResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "CheckProfileResponse")
    public ru.moneta.schemas.messages.CheckProfileResponse checkProfile(

        @WebParam(partName = "CheckProfileRequest", name = "CheckProfileRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.CheckProfileRequest checkProfileRequest
    );

    @WebMethod(operationName = "FindAccountRelations")
    @WebResult(name = "FindAccountRelationsResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindAccountRelationsResponse")
    public ru.moneta.schemas.messages.FindAccountRelationsResponse findAccountRelations(

        @WebParam(partName = "FindAccountRelationsRequest", name = "FindAccountRelationsRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindAccountRelationsRequest findAccountRelationsRequest
    );

    @WebMethod(operationName = "TransferBatch")
    @WebResult(name = "TransferBatchResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "TransferBatchResponse")
    public ru.moneta.schemas.messages.TransferBatchResponse transferBatch(

        @WebParam(partName = "TransferBatchRequest", name = "TransferBatchRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.TransferBatchRequest transferBatchRequest
    );

    @WebMethod(operationName = "DeleteOperationTemplate")
    @WebResult(name = "DeleteOperationTemplateResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "DeleteOperationTemplateResponse")
    public ru.moneta.schemas.messages.DeleteOperationTemplateResponse deleteOperationTemplate(

        @WebParam(partName = "DeleteOperationTemplateRequest", name = "DeleteOperationTemplateRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.DeleteOperationTemplateRequest deleteOperationTemplateRequest
    );

    @WebMethod(operationName = "Invoice")
    @WebResult(name = "InvoiceResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "InvoiceResponse")
    public ru.moneta.schemas.messages.InvoiceResponse invoice(

        @WebParam(partName = "InvoiceRequest", name = "InvoiceRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.InvoiceRequest invoiceRequest
    );

    @WebMethod(operationName = "GetAccountPaymentPasswordChallenge")
    @WebResult(name = "GetAccountPaymentPasswordChallengeResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "GetAccountPaymentPasswordChallengeResponse")
    public ru.moneta.schemas.messages.GetAccountPaymentPasswordChallengeResponse getAccountPaymentPasswordChallenge(

        @WebParam(partName = "GetAccountPaymentPasswordChallengeRequest", name = "GetAccountPaymentPasswordChallengeRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.GetAccountPaymentPasswordChallengeRequest getAccountPaymentPasswordChallengeRequest
    );

    @WebMethod(operationName = "SaveAccountRelation")
    @WebResult(name = "SaveAccountRelationResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "SaveAccountRelationResponse")
    public ru.moneta.schemas.messages.SaveAccountRelationResponse saveAccountRelation(

        @WebParam(partName = "SaveAccountRelationRequest", name = "SaveAccountRelationRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.SaveAccountRelationRequest saveAccountRelationRequest
    );

    @WebMethod(operationName = "VerifyTransaction")
    @WebResult(name = "VerifyTransactionResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "VerifyTransactionResponse")
    public ru.moneta.schemas.messages.VerifyTransactionResponse verifyTransaction(

        @WebParam(partName = "VerifyTransactionRequest", name = "VerifyTransactionRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.VerifyTransactionRequest verifyTransactionRequest
    );

    @WebMethod(operationName = "VerifyPersonificationCode")
    @WebResult(name = "VerifyPersonificationCodeResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "VerifyPersonificationCodeResponse")
    public ru.moneta.schemas.messages.VerifyPersonificationCodeResponse verifyPersonificationCode(

        @WebParam(partName = "VerifyPersonificationCodeRequest", name = "VerifyPersonificationCodeRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.VerifyPersonificationCodeRequest verifyPersonificationCodeRequest
    );

    @WebMethod(operationName = "CreateOperationTemplate")
    @WebResult(name = "CreateOperationTemplateResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "CreateOperationTemplateResponse")
    public ru.moneta.schemas.messages.CreateOperationTemplateResponse createOperationTemplate(

        @WebParam(partName = "CreateOperationTemplateRequest", name = "CreateOperationTemplateRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.CreateOperationTemplateRequest createOperationTemplateRequest
    );

    @WebMethod(operationName = "EditOperationTemplate")
    @WebResult(name = "EditOperationTemplateResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "EditOperationTemplateResponse")
    public ru.moneta.schemas.messages.EditOperationTemplateResponse editOperationTemplate(

        @WebParam(partName = "EditOperationTemplateRequest", name = "EditOperationTemplateRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.EditOperationTemplateRequest editOperationTemplateRequest
    );

    @WebMethod(operationName = "Payment")
    @WebResult(name = "PaymentResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "PaymentResponse")
    public ru.moneta.schemas.messages.PaymentResponse payment(

        @WebParam(partName = "PaymentRequest", name = "PaymentRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.PaymentRequest paymentRequest
    );

    @WebMethod(operationName = "FindLegalInformation")
    @WebResult(name = "FindLegalInformationResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindLegalInformationResponse")
    public ru.moneta.schemas.messages.FindLegalInformationResponse findLegalInformation(

        @WebParam(partName = "FindLegalInformationRequest", name = "FindLegalInformationRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindLegalInformationRequest findLegalInformationRequest
    );

    @WebMethod(operationName = "VerifyPayment")
    @WebResult(name = "VerifyPaymentResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "VerifyPaymentResponse")
    public ru.moneta.schemas.messages.VerifyPaymentResponse verifyPayment(

        @WebParam(partName = "VerifyPaymentRequest", name = "VerifyPaymentRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.VerifyPaymentRequest verifyPaymentRequest
    );

    @WebMethod(operationName = "AuthoriseTransaction")
    @WebResult(name = "AuthoriseTransactionResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "AuthoriseTransactionResponse")
    public ru.moneta.schemas.messages.AuthoriseTransactionResponse authoriseTransaction(

        @WebParam(partName = "AuthoriseTransactionRequest", name = "AuthoriseTransactionRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.AuthoriseTransactionRequest authoriseTransactionRequest
    );

    @WebMethod(operationName = "Refund")
    @WebResult(name = "RefundResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "RefundResponse")
    public ru.moneta.schemas.messages.RefundResponse refund(

        @WebParam(partName = "RefundRequest", name = "RefundRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.RefundRequest refundRequest
    );

    @WebMethod(operationName = "FindOperationsList")
    @WebResult(name = "FindOperationsListResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindOperationsListResponse")
    public ru.moneta.schemas.messages.FindOperationsListResponse findOperationsList(

        @WebParam(partName = "FindOperationsListRequest", name = "FindOperationsListRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindOperationsListRequest findOperationsListRequest
    );

    @WebMethod(operationName = "SecureData")
    @WebResult(name = "SecureDataResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "SecureDataResponse")
    public ru.moneta.schemas.messages.SecureDataResponse secureData(

        @WebParam(partName = "SecureDataRequest", name = "SecureDataRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.SecureDataRequest secureDataRequest
    );

    @WebMethod(operationName = "Ping")
    @WebResult(name = "PingResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "PingResponse")
    public ru.moneta.schemas.messages.PingResponse ping(

        @WebParam(partName = "PingRequest", name = "PingRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.PingRequest pingRequest
    );

    @WebMethod(operationName = "Transfer")
    @WebResult(name = "TransferResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "TransferResponse")
    public ru.moneta.schemas.messages.TransferResponse transfer(

        @WebParam(partName = "TransferRequest", name = "TransferRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.TransferRequest transferRequest
    );

    @WebMethod(operationName = "AccountStatement")
    @WebResult(name = "AccountStatementResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "AccountStatementResponse")
    public ru.moneta.schemas.messages.AccountStatementResponse accountStatement(

        @WebParam(partName = "AccountStatementRequest", name = "AccountStatementRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.AccountStatementRequest accountStatementRequest
    );

    @WebMethod(operationName = "ApprovePhoneApplyCode")
    @WebResult(name = "ApprovePhoneApplyCodeResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "ApprovePhoneApplyCodeResponse")
    public ru.moneta.schemas.messages.ApprovePhoneApplyCodeResponse approvePhoneApplyCode(

        @WebParam(partName = "ApprovePhoneApplyCodeRequest", name = "ApprovePhoneApplyCodeRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.ApprovePhoneApplyCodeRequest approvePhoneApplyCodeRequest
    );

    @WebMethod(operationName = "FindAccountsList")
    @WebResult(name = "FindAccountsListResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindAccountsListResponse")
    public ru.moneta.schemas.messages.FindAccountsListResponse findAccountsList(

        @WebParam(partName = "FindAccountsListRequest", name = "FindAccountsListRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindAccountsListRequest findAccountsListRequest
    );

    @WebMethod(operationName = "CancelTransactionBatch")
    @WebResult(name = "CancelTransactionBatchResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "CancelTransactionBatchResponse")
    public ru.moneta.schemas.messages.CancelTransactionBatchResponse cancelTransactionBatch(

        @WebParam(partName = "CancelTransactionBatchRequest", name = "CancelTransactionBatchRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.CancelTransactionBatchRequest cancelTransactionBatchRequest
    );

    @WebMethod(operationName = "CreateProfileDocument")
    @WebResult(name = "CreateProfileDocumentResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "CreateProfileDocumentResponse")
    public ru.moneta.schemas.messages.CreateProfileDocumentResponse createProfileDocument(

        @WebParam(partName = "CreateProfileDocumentRequest", name = "CreateProfileDocumentRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.CreateProfileDocumentRequest createProfileDocumentRequest
    );

    @WebMethod(operationName = "SimplifiedIdentification")
    @WebResult(name = "SimplifiedIdentificationResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "SimplifiedIdentificationResponse")
    public ru.moneta.schemas.messages.SimplifiedIdentificationResponse simplifiedIdentification(

        @WebParam(partName = "SimplifiedIdentificationRequest", name = "SimplifiedIdentificationRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.SimplifiedIdentificationRequest simplifiedIdentificationRequest
    );

    @WebMethod(operationName = "CreateAccount")
    @WebResult(name = "CreateAccountResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "CreateAccountResponse")
    public long createAccount(

        @WebParam(partName = "CreateAccountRequest", name = "CreateAccountRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.CreateAccountRequest createAccountRequest
    );

    @WebMethod(operationName = "GetOperationDetailsById")
    @WebResult(name = "GetOperationDetailsByIdResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "GetOperationDetailsByIdResponse")
    public ru.moneta.schemas.messages.GetOperationDetailsByIdResponse getOperationDetailsById(

        @WebParam(partName = "GetOperationDetailsByIdRequest", name = "GetOperationDetailsByIdRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        long getOperationDetailsByIdRequest
    );

    @WebMethod(operationName = "EditProfile")
    @WebResult(name = "EditProfileResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "EditProfileResponse")
    public ru.moneta.schemas.messages.EditProfileResponse editProfile(

        @WebParam(partName = "EditProfileRequest", name = "EditProfileRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.EditProfileRequest editProfileRequest
    );

    @WebMethod(operationName = "InvoiceBatch")
    @WebResult(name = "InvoiceBatchResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "InvoiceBatchResponse")
    public ru.moneta.schemas.messages.InvoiceBatchResponse invoiceBatch(

        @WebParam(partName = "InvoiceBatchRequest", name = "InvoiceBatchRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.InvoiceBatchRequest invoiceBatchRequest
    );

    @WebMethod(operationName = "FindAccountById")
    @WebResult(name = "FindAccountByIdResponse", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd", partName = "FindAccountByIdResponse")
    public ru.moneta.schemas.messages.FindAccountByIdResponse findAccountById(

        @WebParam(partName = "FindAccountByIdRequest", name = "FindAccountByIdRequest", targetNamespace = "http://www.moneta.ru/schemas/messages.xsd")
        ru.moneta.schemas.messages.FindAccountByIdRequest findAccountByIdRequest
    );
}