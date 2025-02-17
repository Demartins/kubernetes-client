
package io.fabric8.openshift.api.model.config.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
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
    "domainPatterns",
    "includeSubDomainsPolicy",
    "maxAge",
    "namespaceSelector",
    "preloadPolicy"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class RequiredHSTSPolicy implements KubernetesResource
{

    @JsonProperty("domainPatterns")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> domainPatterns = new ArrayList<String>();
    @JsonProperty("includeSubDomainsPolicy")
    private String includeSubDomainsPolicy;
    @JsonProperty("maxAge")
    private MaxAgePolicy maxAge;
    @JsonProperty("namespaceSelector")
    private io.fabric8.kubernetes.api.model.LabelSelector namespaceSelector;
    @JsonProperty("preloadPolicy")
    private String preloadPolicy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequiredHSTSPolicy() {
    }

    public RequiredHSTSPolicy(List<String> domainPatterns, String includeSubDomainsPolicy, MaxAgePolicy maxAge, io.fabric8.kubernetes.api.model.LabelSelector namespaceSelector, String preloadPolicy) {
        super();
        this.domainPatterns = domainPatterns;
        this.includeSubDomainsPolicy = includeSubDomainsPolicy;
        this.maxAge = maxAge;
        this.namespaceSelector = namespaceSelector;
        this.preloadPolicy = preloadPolicy;
    }

    @JsonProperty("domainPatterns")
    public List<String> getDomainPatterns() {
        return domainPatterns;
    }

    @JsonProperty("domainPatterns")
    public void setDomainPatterns(List<String> domainPatterns) {
        this.domainPatterns = domainPatterns;
    }

    @JsonProperty("includeSubDomainsPolicy")
    public String getIncludeSubDomainsPolicy() {
        return includeSubDomainsPolicy;
    }

    @JsonProperty("includeSubDomainsPolicy")
    public void setIncludeSubDomainsPolicy(String includeSubDomainsPolicy) {
        this.includeSubDomainsPolicy = includeSubDomainsPolicy;
    }

    @JsonProperty("maxAge")
    public MaxAgePolicy getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(MaxAgePolicy maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("namespaceSelector")
    public io.fabric8.kubernetes.api.model.LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    @JsonProperty("namespaceSelector")
    public void setNamespaceSelector(io.fabric8.kubernetes.api.model.LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    @JsonProperty("preloadPolicy")
    public String getPreloadPolicy() {
        return preloadPolicy;
    }

    @JsonProperty("preloadPolicy")
    public void setPreloadPolicy(String preloadPolicy) {
        this.preloadPolicy = preloadPolicy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
