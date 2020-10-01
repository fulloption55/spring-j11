//package com.theerut.springj11.controller;
//
//import com.theerut.springj11.annotation.LogStartEnd;
//import com.theerut.springj11.constant.ResponseConstant;
//import com.theerut.springj11.controller.request.KycGradeRequest;
//import com.theerut.springj11.controller.request.ValidateFatcaRequest;
//import com.theerut.springj11.controller.request.WatchListRequest;
//import com.theerut.springj11.controller.response.GeneralResponse;
//import com.theerut.springj11.controller.response.ProfileFatcaResponse;
//import com.theerut.springj11.controller.response.ProfileKycResponse;
//import com.theerut.springj11.controller.response.ProfileWatchListStatusResponse;
//import com.theerut.springj11.factory.response.ResponseFactory;
//import com.theerut.springj11.service.ProfileService;
//import com.theerut.springj11.service.model.Profile;
//import com.theerut.springj11.service.model.ProfileFatca;
//import com.theerut.springj11.service.model.WatchlistStatus;
//import com.theerut.springj11.utils.EXAMPayload;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@Slf4j
//@RestController
//@RequiredArgsConstructor
//public class AccountApplicationController {
//    private final ResponseFactory responseFactory;
//    private final EXAMPayload payload;
//
//    private static final String ERROR_LOG_TEMPLATE = "Error {}";
//
//    @LogStartEnd
//    @PostMapping(value = "/v1/accounts/validations/watchlist")
//    public ResponseEntity<GeneralResponse<ProfileWatchListStatusResponse>> checkWatchlistStatus() {
//        String userId = payload.getUserId();
//        payload.setDeviceId(null);
//        try {
//            final GeneralResponse<WatchlistStatus> watchListStatus = profileService.getWatchlistStatus(payload);
//            final boolean watchlistStatus = profileService.validateWatchlistStatus(userId, watchListStatus, payload);
//            return responseFactory.success(ProfileWatchListStatusResponse.builder()
//                    .status(watchlistStatus)
//                    .build());
//
//        } catch (IllegalArgumentException iae) {
//            log.error(ERROR_LOG_TEMPLATE, iae.toString());
//            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
//        } catch (Exception e) {
//            log.error(ERROR_LOG_TEMPLATE, e.toString());
//            return responseFactory.error(HttpStatus.INTERNAL_SERVER_ERROR, ResponseConstant.GENERAL_ERROR_CODE);
//        }
//    }
//
//    @LogStartEnd
//    @PostMapping(value = "/v1//management/accounts/validations/watchlist")
//    public ResponseEntity<GeneralResponse<ProfileWatchListStatusResponse>> checkWatchlistStatusManagement(@RequestBody WatchListRequest watchListRequest) {
//        String userId = watchListRequest.getUserId();
//        try {
//            log.info("Check watch list of user ID [{}]", watchListRequest.getUserId());
//            final GeneralResponse<WatchlistStatus> watchListStatus = profileService.getWatchlistStatus(payload, watchListRequest.getUserId());
//            final boolean watchlistStatus = profileService.validateWatchlistStatus(userId, watchListStatus, payload);
//            return responseFactory.success(ProfileWatchListStatusResponse.builder()
//                    .status(watchlistStatus)
//                    .build());
//
//        } catch (IllegalArgumentException iae) {
//            log.error(ERROR_LOG_TEMPLATE, iae.toString());
//            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
//        } catch (Exception e) {
//            log.error(ERROR_LOG_TEMPLATE, e.toString());
//            return responseFactory.error(HttpStatus.INTERNAL_SERVER_ERROR, ResponseConstant.GENERAL_ERROR_CODE);
//        }
//    }
//
//    @LogStartEnd
//    @PostMapping(value = "/v1/accounts/validations/fatca")
//    public ResponseEntity<GeneralResponse<ProfileFatcaResponse>> checkFatcaStatus() {
//        String userId = payload.getUserId();
//        payload.setDeviceId(null);
//        try {
//            final GeneralResponse<ProfileFatca> profileFatca = profileService.getProfileFatca(payload);
//            final boolean fatcaStatus = profileService.validateFatcaStatus(userId, profileFatca, payload);
//            return responseFactory.success(ProfileFatcaResponse.builder()
//                    .status(fatcaStatus)
//                    .build());
//        } catch (IllegalArgumentException iae) {
//            log.error(ERROR_LOG_TEMPLATE, iae.toString());
//            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
//        }
//    }
//
//
//    @LogStartEnd
//    @PostMapping(value = "/v1/management/accounts/validations/fatca")
//    public ResponseEntity<GeneralResponse<ProfileFatcaResponse>> checkFatcaStatusManagement(@RequestBody ValidateFatcaRequest request) {
//        String userId = request.getUserId();
//        try {
//            final GeneralResponse<ProfileFatca> profileFatca = profileService.getProfileFatca(payload, request.getUserId());
//            final boolean fatcaStatus = profileService.validateFatcaStatus(userId, profileFatca, payload);
//            return responseFactory.success(ProfileFatcaResponse.builder()
//                    .status(fatcaStatus)
//                    .build());
//        } catch (IllegalArgumentException iae) {
//            log.error(ERROR_LOG_TEMPLATE, iae.toString());
//            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
//        }
//    }
//
//    @LogStartEnd
//    @PostMapping(value = "/v1/accounts/validations/kyc-grades")
//    public ResponseEntity<GeneralResponse<ProfileKycResponse>> checkKycGrade() {
//        String userId = payload.getUserId();
//        payload.setDeviceId(null);
//        try {
//            final GeneralResponse<Profile> profile = profileService.getProfile(payload);
//            final boolean kycStatus = profileService.validateKycStatus(userId, profile, payload);
//            return responseFactory.success(ProfileKycResponse.builder()
//                    .status(kycStatus)
//                    .build());
//        } catch (IllegalArgumentException iae) {
//            log.error(ERROR_LOG_TEMPLATE, iae.toString());
//            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
//        } catch (Exception e) {
//            log.error(ERROR_LOG_TEMPLATE, e.toString());
//            return responseFactory.error(HttpStatus.INTERNAL_SERVER_ERROR, ResponseConstant.GENERAL_ERROR_CODE);
//        }
//    }
//
//
//    @LogStartEnd
//    @PostMapping(value = "/v1/management/accounts/validations/kyc-grades")
//    public ResponseEntity<GeneralResponse<ProfileKycResponse>> checkKycGradeManagement(@RequestBody KycGradeRequest kycGradeRequest) {
//        String userId = kycGradeRequest.getUserId();
//        try {
//            log.info("Check kyc grade of user ID [{}]", kycGradeRequest.getUserId());
//            final GeneralResponse<Profile> profile = profileService.getProfile(payload, kycGradeRequest.getUserId());
//            final boolean kycStatus = profileService.validateKycStatus(userId, profile, payload);
//            return responseFactory.success(ProfileKycResponse.builder()
//                    .status(kycStatus)
//                    .build());
//        } catch (IllegalArgumentException iae) {
//            log.error(ERROR_LOG_TEMPLATE, iae.toString());
//            return responseFactory.error(HttpStatus.BAD_REQUEST, ResponseConstant.GENERAL_ERROR_CODE);
//        } catch (Exception e) {
//            log.error(ERROR_LOG_TEMPLATE, e.toString());
//            return responseFactory.error(HttpStatus.INTERNAL_SERVER_ERROR, ResponseConstant.GENERAL_ERROR_CODE);
//        }
//    }
//
//}
