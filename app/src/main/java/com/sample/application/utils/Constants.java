package com.sample.application.utils;

import java.util.Arrays;
import java.util.List;

/**
 * A class that specifies all the constant variables used in the project
 */

public class Constants {
    public static final String CAN_ADD_WATER_POINT = "canAddWaterPoint";
    public static final String CAN_ADD_REPORT = "canAddReport";


    public static String TAG = Constants.class.getSimpleName();

    public static final Double KENYA_LATITUDE = 0.1768696;
    public static final Double KENYA_LONGITUDE = 37.9083264;

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int NEGATIVE_ONE = -1;

    public static final int OFFLINE_STATUS_CODE = 100001;

    public static final String KENYA = "kenya";
    public static final String TURKANA = "turkana";
    public static final String MARSABIT = "marsabit";
    public static final String ISIOLO = "isiolo";
    public static final String GARISSA = "garissa";
    public static final String WAJIR = "wajir";

    public static final String APP_NAME = "wmaasp";

    public static final String AREA = "area";
    public static final String ADDED_BY = "addedBy";
    public static final String ADDED_BY_ID = "addedById";
    public static final String ANIMALS = "animals";
    public static final String ASSIGNED_TO = "assignedTo";
    public static final String ATTACHMENT = "attachment";

    public static final String BH_YIELD = "bhyield";

    public static final String CAPACITY = "capacity";
    public static final String CATEGORY = "category";
    public static final String CHALLENGE = "challenge";
    public static final String CLOSED = "closed";
    public static final String COMMUNITY_IMPRESSION = "communityImpression";
    public static final String COMMUNITY_IMPRESSIONS = "communityImpressions";
    public static final String COMMUNITY_IMPRESSION_SUMMARIES = "communityImpressionsSummaries";
    public static final String CONNECTIVITY = "connectivity";
    public static final String CONNECTIVITY_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final String CONSTITUENCY = "constituency";
    public static final String CONSTITUENCIES = "constituencies";
    public static final String CONTAINS_ATTACHMENT = "containsAttachment";
    public static final String COST = "cost";

    public static final String COST_TWENTY_LITRES = "costpertwentyltrs";

    public static final String COUNTIES = "counties";
    public static final String COUNTY = "county";
    public static final String COUNTY_ID = "countyId";

    public static final String COUNTRY_CODE = "254";

    public static final String DAILY_COST_PER_COW = "dailycostpercow";
    public static final String DAILY_COST_PER_CAMEL = "dailycostpercamel";
    public static final String DAILY_COST_PER_GOAT = "dailycostpergoat";

    public static final String DATA = "data";
    public static final String DATE = "date";
    public static final String DATE_CLOSED = "dateClosed";
    public static final String DATE_CREATED = "dateCreated";
    public static final String DATE_JOINED = "dateJoined";
    public static final String DATE_OPENED = "dateOpened";
    public static final String DEPTH = "depth";
    public static final String DESCRIPTION = "description";
    public static final String DISTANCE_FROM_CC = "distancefromcountycenter";

    public static final String ERROR = "error";
    public static final String EMAIL = "email";

    public static final String FAILURE_REPORTER = "failureReporter";
    public static final String FAILURE_REPORTERS = "failureReporters";
    public static final String FARMS = "farms";
    public static final String FIRST_NAME = "firstName";
    public static final String FUNDING_ORG = "fundingOrg";
    public static final String FUNDING_ORG_ID = "fundingorgId";

    public static final String GOVERNMENT = "government";

    public static final String ID = "id";
    public static final String IMPRESSION = "impressionValues";
    public static final String INSTRUMENTED_WP = "instrumentedWaterpoint";
    public static final String ISSUE = "issue";

    public static final String JSON_ARRAY = "jsonArray";
    public static final String JSON_OBJECT = "jsonObject";

    public static final String LANDMARKS = "landmarks";
    public static final String LATITUDE = "lat";
    public static final String LONGITUDE = "lon";
    public static final String LAST_NAME = "lastName";
    public static final String LOGIN = "login";

    public static final String MANAGEMENT_PRACTICES = "managementPractices";
    public static final String MANAGERS = "managers";
    public static final String MESSAGE = "message";
    public static final String METER_AVAILABILITY = "meteravailability";
    public static final String METER_OPERATIONAL_STATUS = "meteroperationalstatus";

    public static final String MONTHLY_FLAT_RATE = "monthlyflatrate";

    public static final String NAME = "name";
    public static final String NATIONALITY = "nationality";
    public static final String NEW = "new";
    public static final String NEW_PASSWORD = "newPassword";
    public static final String NONE = "none";
    public static final String NO_OPERATIONAL_STATUS = "No operational status given";
    public static final String NOTES = "notes";
    public static final String NO_WARD = "No ward given";

    public static final String OPERATIONAL_STATUS = "operationalStatus";
    public static final String OPERATIONAL_STATUSES = "operationalStatuses";
    public static final String ORGANIZATION = "organization";
    public static final String ORGANIZATIONS = "organizations";
    public static final String OWNERS = "owners";

    public static final String PASSWORD = "password";
    public static final String PAYMENT_MANAGEMENT = "paymentManagement";
    public static final String PEOPLE = "people";
    public static final String PHONE_NUMBER = "phoneNumber";
    public static final String PROFILE = "profile";
    public static final String PUBLIC = "public";
    public static final String PUMP_TYPES = "pumpTypes";

    public static final String QUALITY = "quality";
    public static final String QUANTITY = "quantity";

    public static final String REFRESH_TOKEN = "refreshToken";
    public static final String REGISTER = "register";
    public static final String RELIABILITY = "reliability";
    public static final String REPAIR = "repair";
    public static final String REPAIRED_BY = "repairedby";
    public static final String REPAIR_TYPE = "repairtype";
    public static final String REPORT = "report";
    public static final String REPAIR_REPORT = "repair";
    public static final String REPORT_CATEGORIES = "reportCategories";
    public static final String REPORT_ID = "reportId";
    public static final String REPORT_PROGRESS = "reportProgress";
    public static final String REPORT_PROGRESS_STATUSES = "reportProgressStatuses";
    public static final String REPORTED_BY = "reportedBy";
    public static final String REPORT_TYPE = "reportType";
    public static final String RESET_KEY = "resetKey";
    public static final String RESET_PASSWORD = "resetPassword";
    public static final String RESPONSE_TIME = "responsetime";
    public static final String RETRIEVAL_MEANS = "retrievalMeans";
    public static final String ROLES = "roles";
    public static final String RURAL_URBAN = "ruralurban";

    public static final String SERVICING_AGENT = "servicingAgent";
    public static final String SERVICING_AGENTS = "servicingAgents";
    public static final String SITE_REPORT = "siteReport";
    public static final String SITE_REPORTS = "siteReports";
    public static final String SITE_REPORT_CATEGORIES = "siteReportCategories";
    public static final String SITE_REPORT_SUB_CATEGORIES = "siteReportSubCategories";
    public static final String STATUS = "status";
    public static final String STATUS_CODE = "statusCode";
    public static final String STATUS_MESSAGE = "statusMessage";

    public static final String SUB_COUNTIES = "subCounties";
    public static final String SUB_COUNTY = "subCounty";
    public static final String SUBCOUNTY = "sub-County";
    public static final String SUCCESS = "success";

    public static final String TELECOM_CARRIER = "telecomcarrier";
    public static final String TELECOM_CARRIERS = "telecomCarriers";
    public static final String TICKET_NO = "ticketNo";
    public static final String TITLE = "title";
    public static final String TOKEN = "token";
    public static final String TOWN = "town";
    public static final String TYPE = "type";
    public static final String TYPE_NAME = "typename";

    public static final String UPDATED = "UPDATED";
    public static final String USAGE = "usage";
    public static final String USER = "user";
    public static final String USER_ID = "userId";
    public static final String USERNAME = "username";

    public static final String VERIFY_PIN = "verifyPin";

    public static final String WARD = "ward";
    public static final String WARD_ID = "wardId";
    public static final String WARDS = "wards";
    public static final String WATER_POINT = "waterPoint";
    public static final String WATERPOINT = "waterpoint";
    public static final String WATERPOINT_MINI = "waterpointMini";
    public static final String WATER_POINT_CHALLENGE = "waterpointChallenge";
    public static final String WATER_POINT_COST = "waterpointCost";
    public static final String WATER_POINT_DETAILED = "waterPointDetailed";
    public static final String WATER_POINT_FAILURE_REPORTER = "waterpointFailureReporter";
    public static final String WATER_POINT_ID = "waterpointId";
    public static final String WATER_POINT_MANAGERS = "waterpointManagers";
    public static final String WATER_POINT_NOTES = "waterpointNotes";
    public static final String WATER_POINT_OWNERS = "waterpointOwners";
    public static final String WATER_POINT_REPAIR = "waterpointRepair";
    public static final String WATER_POINT_SERVICING_AGENTS = "waterpointServicingAgents";
    public static final String WATER_POINT_TEST = "waterpointTest";
    public static final String WATER_POINT_USAGE = "waterpointUsage";
    public static final String WATER_POINT_STATUS = "waterpointstatus";
    public static final String WATER_POINTS = "waterPoints";
    public static final String WATER_POINTS_COUNTY = "waterPointsCounty";
    public static final String WATER_POINTS_OPERATIONAL_STATUS = "waterPointsOperationalStatus";
    public static final String WATER_POINT_TYPE = "waterpointType";
    public static final String WATER_POINT_TYPES = "waterpointTypes";
    public static final String WATER_POINT_TYPE_ID = "wptypeId";
    public static final String WATER_QUALITY = "waterquality";
    public static final String WATER_RETRIEVAL_MEANS = "waterretrievalmeans";
    public static final String WATER_RELIABILITY = "waterPointReliability";
    public static final String WEB_PAGE_LOAD = "webpageload";
    public static final String WP_TYPE_ID = "wptypeId";
    public static final String REPORTS = "reports";

    public static final String YEAR = "year";
    public static final String YEAR_OF_CONSTRUCTION = "yearofconstruction";
    public static final String YIELD = "yield";

    public static final String NEXT_SYNC_TIME = "nextSyncTime";

    //roles
    public static final String SUB_COUNTY_OFFICER = "SUB_COUNTY_OFFICER";
    public static final String COUNTY_OFFICER = "COUNTY_OFFICER";
    public static final String WARD_OFFICER = "WARD_OFFICER";
    public static final String SWEET_SENSE_OFFICER = "SWEET_SENSE_OFFICER";
    public static final String FIELD_OFFICER = "FIELD_OFFICER";
    public static final String SUPER_USER = "SUPER_USER";
    public static final String ORG_ADMIN = "ORG_ADMIN";

    public static String FILTER = "filter";

    public static String OPEN = "open";
    public static String ASSIGNED = "assigned";
    public static String UNDER_REVIEW = "Under-Review";

    public static List<String> REPAIR_TYPES = Arrays.asList("Sensor-repair", "Borehole-repair","Pump-repair","Generator-repair");
}
