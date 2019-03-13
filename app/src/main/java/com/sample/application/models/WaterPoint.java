package com.sample.application.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Peninah Waweru on 27/04/2018.
 */
public class WaterPoint implements Serializable {

    private int id;
    private boolean meteravailability;
    private boolean webpageload;
    private Double bhyield;
    private Double capacity;
    private Double depth;
    private Double distancefromcountycenter;
    private Double lat;
    private Double lon;
    private Double quantity;
    private String name;
    private String waterretrievalmeans;
    private String reliability;
    private String telecomcarrier;
    private String addedById;
    private String ruralurban;
    private String status;
    private String town;
    private String waterquality;
    private String yearofconstruction;

    private County county;

    private Ward ward;

    private String fundingorgId;

    private List<Landmark> landmarks;

    private OperationalStatus operationalStatus;

    private WaterPointType waterpointType;

    private InstrumentedWaterPoint instrumentedWaterpoint;

    private Cost waterpointCost;

    private Challenge waterpointChallenge;

    private Impression communityImpression;

    private FailureReporter waterpointFailureReporter;

    private List<Manager> waterpointManagers;

    private List<Owner> waterpointOwners;

    private List<ServicingAgent> waterpointServicingAgents;

    private ManagementPractice managementPractices;

    private Notes waterpointNotes;

    private PaymentManager paymentManagement;

    private Repair waterpointRepair;

    private Test waterpointTest;

    private Usage waterpointUsage;

    private Organization fundingOrg;

    public WaterPoint() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMeteravailability() {
        return meteravailability;
    }

    public void setMeteravailability(boolean meteravailability) {
        this.meteravailability = meteravailability;
    }

    public boolean isWebpageload() {
        return webpageload;
    }

    public void setWebpageload(boolean webpageload) {
        this.webpageload = webpageload;
    }

    public Double getBhyield() {
        return bhyield;
    }

    public void setBhyield(Double bhyield) {
        this.bhyield = bhyield;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public Double getDistancefromcountycenter() {
        return distancefromcountycenter;
    }

    public void setDistancefromcountycenter(Double distancefromcountycenter) {
        this.distancefromcountycenter = distancefromcountycenter;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWaterretrievalmeans() {
        return waterretrievalmeans;
    }

    public void setWaterretrievalmeans(String waterretrievalmeans) {
        this.waterretrievalmeans = waterretrievalmeans;
    }

    public String getReliability() {
        return reliability;
    }

    public void setReliability(String reliability) {
        this.reliability = reliability;
    }

    public String getTelecomcarrier() {
        return telecomcarrier;
    }

    public void setTelecomcarrier(String telecomcarrier) {
        this.telecomcarrier = telecomcarrier;
    }

    public String getAddedById() {
        return addedById;
    }

    public void setAddedById(String addedById) {
        this.addedById = addedById;
    }

    public String getRuralurban() {
        return ruralurban;
    }

    public void setRuralurban(String ruralurban) {
        this.ruralurban = ruralurban;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getWaterquality() {
        return waterquality;
    }

    public void setWaterquality(String waterquality) {
        this.waterquality = waterquality;
    }

    public String getYearofconstruction() {
        return yearofconstruction;
    }

    public void setYearofconstruction(String yearofconstruction) {
        this.yearofconstruction = yearofconstruction;
    }

    public String getFundingorgId() {
        return fundingorgId;
    }

    public void setFundingorgId(String fundingorgId) {
        this.fundingorgId = fundingorgId;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public OperationalStatus getOperationalStatus() {
        return operationalStatus;
    }

    public void setOperationalStatus(OperationalStatus operationalStatus) {
        this.operationalStatus = operationalStatus;
    }

    public WaterPointType getWaterpointType() {
        return waterpointType;
    }

    public void setWaterpointType(WaterPointType waterpointType) {
        this.waterpointType = waterpointType;
    }

    public InstrumentedWaterPoint getInstrumentedWaterpoint() {
        return instrumentedWaterpoint;
    }

    public void setInstrumentedWaterpoint(InstrumentedWaterPoint instrumentedWaterPoint) {
        this.instrumentedWaterpoint = instrumentedWaterPoint;
    }

    public Cost getWaterpointCost() {
        return waterpointCost;
    }

    public void setWaterpointCost(Cost waterpointCost) {
        this.waterpointCost = waterpointCost;
    }

    public Challenge getWaterpointChallenge() {
        return waterpointChallenge;
    }

    public void setWaterpointChallenge(Challenge waterpointChallenge) {
        this.waterpointChallenge = waterpointChallenge;
    }

    public Impression getCommunityImpression() {
        return communityImpression;
    }

    public void setCommunityImpression(Impression communityImpression) {
        this.communityImpression = communityImpression;
    }

    public FailureReporter getWaterpointFailureReporter() {
        return waterpointFailureReporter;
    }

    public void setWaterpointFailureReporter(FailureReporter waterpointFailureReporter) {
        this.waterpointFailureReporter = waterpointFailureReporter;
    }

    public ManagementPractice getManagementPractices() {
        return managementPractices;
    }

    public void setManagementPractices(ManagementPractice managementPractices) {
        this.managementPractices = managementPractices;
    }

    public Notes getWaterpointNotes() {
        return waterpointNotes;
    }

    public void setWaterpointNotes(Notes waterpointNotes) {
        this.waterpointNotes = waterpointNotes;
    }

    public PaymentManager getPaymentManagement() {

        return paymentManagement;
    }

    public void setPaymentManagement(PaymentManager paymentManagement) {
        this.paymentManagement = paymentManagement;
    }

    public Repair getWaterpointRepair() {
        return waterpointRepair;
    }

    public void setWaterpointRepair(Repair waterpointRepair) {
        this.waterpointRepair = waterpointRepair;
    }

    public Test getWaterpointTest() {
        return waterpointTest;
    }

    public void setWaterpointTest(Test waterpointTest) {
        this.waterpointTest = waterpointTest;
    }

    public Usage getWaterpointUsage() {
        return waterpointUsage;
    }

    public void setWaterpointUsage(Usage waterpointUsage) {
        this.waterpointUsage = waterpointUsage;
    }

    public List<Landmark> getLandmarks() {
        return landmarks;
    }

    public void setLandmarks(List<Landmark> landmarks) {
        this.landmarks = landmarks;
    }

    public List<Manager> getWaterpointManagers() {
        return waterpointManagers;
    }

    public void setWaterpointManagers(List<Manager> waterpointManagers) {
        this.waterpointManagers = waterpointManagers;
    }

    public List<Owner> getWaterpointOwners() {
        return waterpointOwners;
    }

    public void setWaterpointOwners(List<Owner> waterpointOwners) {
        this.waterpointOwners = waterpointOwners;
    }

    public List<ServicingAgent> getWaterpointServicingAgents() {
        return waterpointServicingAgents;
    }

    public void setWaterpointServicingAgents(List<ServicingAgent> waterpointServicingAgents) {
        this.waterpointServicingAgents = waterpointServicingAgents;
    }

    public Organization getFundingOrg() {
        return fundingOrg;
    }

    public void setFundingOrg(Organization fundingOrg) {
        this.fundingOrg = fundingOrg;
    }
}

