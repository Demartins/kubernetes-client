
package io.fabric8.kubernetes.api.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.version.Info;
import io.fabric8.openshift.api.model.machine.v1.NutanixCategory;
import io.fabric8.openshift.api.model.machine.v1.NutanixResourceIdentifier;
import io.fabric8.openshift.api.model.machine.v1alpha1.SubnetFilter;
import io.fabric8.openshift.api.model.machine.v1beta1.Machine;
import io.fabric8.openshift.api.model.machine.v1beta1.MachineHealthCheck;
import io.fabric8.openshift.api.model.machine.v1beta1.MachineHealthCheckList;
import io.fabric8.openshift.api.model.machine.v1beta1.MachineList;
import io.fabric8.openshift.api.model.machine.v1beta1.MachineSet;
import io.fabric8.openshift.api.model.machine.v1beta1.MachineSetList;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "APIGroup",
    "APIGroupList",
    "BaseKubernetesList",
    "Info",
    "Machine",
    "MachineHealthCheck",
    "MachineHealthCheckList",
    "MachineList",
    "MachineSet",
    "MachineSetList",
    "ObjectMeta",
    "Patch",
    "Status",
    "Time",
    "TypeMeta",
    "V1Alpha1SubnetFilter",
    "V1NutanixCategory",
    "V1NutanixResourceIdentifier"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class ValidationSchema {

    @JsonProperty("APIGroup")
    private APIGroup aPIGroup;
    @JsonProperty("APIGroupList")
    private APIGroupList aPIGroupList;
    @JsonProperty("BaseKubernetesList")
    private KubernetesList baseKubernetesList;
    @JsonProperty("Info")
    private Info info;
    @JsonProperty("Machine")
    private Machine machine;
    @JsonProperty("MachineHealthCheck")
    private MachineHealthCheck machineHealthCheck;
    @JsonProperty("MachineHealthCheckList")
    private MachineHealthCheckList machineHealthCheckList;
    @JsonProperty("MachineList")
    private MachineList machineList;
    @JsonProperty("MachineSet")
    private MachineSet machineSet;
    @JsonProperty("MachineSetList")
    private MachineSetList machineSetList;
    @JsonProperty("ObjectMeta")
    private io.fabric8.kubernetes.api.model.ObjectMeta objectMeta;
    @JsonProperty("Patch")
    private Patch patch;
    @JsonProperty("Status")
    private Status status;
    @JsonProperty("Time")
    private String time;
    @JsonProperty("TypeMeta")
    private TypeMeta typeMeta;
    @JsonProperty("V1Alpha1SubnetFilter")
    private SubnetFilter v1Alpha1SubnetFilter;
    @JsonProperty("V1NutanixCategory")
    private NutanixCategory v1NutanixCategory;
    @JsonProperty("V1NutanixResourceIdentifier")
    private NutanixResourceIdentifier v1NutanixResourceIdentifier;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new LinkedHashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ValidationSchema() {
    }

    public ValidationSchema(APIGroup aPIGroup, APIGroupList aPIGroupList, KubernetesList baseKubernetesList, Info info, Machine machine, MachineHealthCheck machineHealthCheck, MachineHealthCheckList machineHealthCheckList, MachineList machineList, MachineSet machineSet, MachineSetList machineSetList, io.fabric8.kubernetes.api.model.ObjectMeta objectMeta, Patch patch, Status status, String time, TypeMeta typeMeta, SubnetFilter v1Alpha1SubnetFilter, NutanixCategory v1NutanixCategory, NutanixResourceIdentifier v1NutanixResourceIdentifier) {
        super();
        this.aPIGroup = aPIGroup;
        this.aPIGroupList = aPIGroupList;
        this.baseKubernetesList = baseKubernetesList;
        this.info = info;
        this.machine = machine;
        this.machineHealthCheck = machineHealthCheck;
        this.machineHealthCheckList = machineHealthCheckList;
        this.machineList = machineList;
        this.machineSet = machineSet;
        this.machineSetList = machineSetList;
        this.objectMeta = objectMeta;
        this.patch = patch;
        this.status = status;
        this.time = time;
        this.typeMeta = typeMeta;
        this.v1Alpha1SubnetFilter = v1Alpha1SubnetFilter;
        this.v1NutanixCategory = v1NutanixCategory;
        this.v1NutanixResourceIdentifier = v1NutanixResourceIdentifier;
    }

    @JsonProperty("APIGroup")
    public APIGroup getAPIGroup() {
        return aPIGroup;
    }

    @JsonProperty("APIGroup")
    public void setAPIGroup(APIGroup aPIGroup) {
        this.aPIGroup = aPIGroup;
    }

    @JsonProperty("APIGroupList")
    public APIGroupList getAPIGroupList() {
        return aPIGroupList;
    }

    @JsonProperty("APIGroupList")
    public void setAPIGroupList(APIGroupList aPIGroupList) {
        this.aPIGroupList = aPIGroupList;
    }

    @JsonProperty("BaseKubernetesList")
    public KubernetesList getBaseKubernetesList() {
        return baseKubernetesList;
    }

    @JsonProperty("BaseKubernetesList")
    public void setBaseKubernetesList(KubernetesList baseKubernetesList) {
        this.baseKubernetesList = baseKubernetesList;
    }

    @JsonProperty("Info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("Info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("Machine")
    public Machine getMachine() {
        return machine;
    }

    @JsonProperty("Machine")
    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    @JsonProperty("MachineHealthCheck")
    public MachineHealthCheck getMachineHealthCheck() {
        return machineHealthCheck;
    }

    @JsonProperty("MachineHealthCheck")
    public void setMachineHealthCheck(MachineHealthCheck machineHealthCheck) {
        this.machineHealthCheck = machineHealthCheck;
    }

    @JsonProperty("MachineHealthCheckList")
    public MachineHealthCheckList getMachineHealthCheckList() {
        return machineHealthCheckList;
    }

    @JsonProperty("MachineHealthCheckList")
    public void setMachineHealthCheckList(MachineHealthCheckList machineHealthCheckList) {
        this.machineHealthCheckList = machineHealthCheckList;
    }

    @JsonProperty("MachineList")
    public MachineList getMachineList() {
        return machineList;
    }

    @JsonProperty("MachineList")
    public void setMachineList(MachineList machineList) {
        this.machineList = machineList;
    }

    @JsonProperty("MachineSet")
    public MachineSet getMachineSet() {
        return machineSet;
    }

    @JsonProperty("MachineSet")
    public void setMachineSet(MachineSet machineSet) {
        this.machineSet = machineSet;
    }

    @JsonProperty("MachineSetList")
    public MachineSetList getMachineSetList() {
        return machineSetList;
    }

    @JsonProperty("MachineSetList")
    public void setMachineSetList(MachineSetList machineSetList) {
        this.machineSetList = machineSetList;
    }

    @JsonProperty("ObjectMeta")
    public io.fabric8.kubernetes.api.model.ObjectMeta getObjectMeta() {
        return objectMeta;
    }

    @JsonProperty("ObjectMeta")
    public void setObjectMeta(io.fabric8.kubernetes.api.model.ObjectMeta objectMeta) {
        this.objectMeta = objectMeta;
    }

    @JsonProperty("Patch")
    public Patch getPatch() {
        return patch;
    }

    @JsonProperty("Patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("Time")
    public String getTime() {
        return time;
    }

    @JsonProperty("Time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("TypeMeta")
    public TypeMeta getTypeMeta() {
        return typeMeta;
    }

    @JsonProperty("TypeMeta")
    public void setTypeMeta(TypeMeta typeMeta) {
        this.typeMeta = typeMeta;
    }

    @JsonProperty("V1Alpha1SubnetFilter")
    public SubnetFilter getV1Alpha1SubnetFilter() {
        return v1Alpha1SubnetFilter;
    }

    @JsonProperty("V1Alpha1SubnetFilter")
    public void setV1Alpha1SubnetFilter(SubnetFilter v1Alpha1SubnetFilter) {
        this.v1Alpha1SubnetFilter = v1Alpha1SubnetFilter;
    }

    @JsonProperty("V1NutanixCategory")
    public NutanixCategory getV1NutanixCategory() {
        return v1NutanixCategory;
    }

    @JsonProperty("V1NutanixCategory")
    public void setV1NutanixCategory(NutanixCategory v1NutanixCategory) {
        this.v1NutanixCategory = v1NutanixCategory;
    }

    @JsonProperty("V1NutanixResourceIdentifier")
    public NutanixResourceIdentifier getV1NutanixResourceIdentifier() {
        return v1NutanixResourceIdentifier;
    }

    @JsonProperty("V1NutanixResourceIdentifier")
    public void setV1NutanixResourceIdentifier(NutanixResourceIdentifier v1NutanixResourceIdentifier) {
        this.v1NutanixResourceIdentifier = v1NutanixResourceIdentifier;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
