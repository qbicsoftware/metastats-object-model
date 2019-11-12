@GrabResolver(name='jitpack.io', root='https://jitpack.io')
@Grab(group='com.github.everit-org.json-schema', module='org.everit.json.schema', version='1.12.0')
@Grab(group='org.spockframework', module='spock-core', version='1.3-groovy-2.4')
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import spock.lang.Specification
import spock.lang.Shared

class ValidateSpecification extends Specification {

    @Shared
    Schema schema

    def setupSpec() {
        InputStream inputStream = getClass().getResourceAsStream("./model.schema.json")
        JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream))
        schema = SchemaLoader.load(rawSchema)
    }

    def 'qbicID exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_qbicId.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'seqFacilityId exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_seqFacilityId.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'sampleName exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_sampleName.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'sampleGroup exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_sampleGroup.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'species exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_species.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'extractCode exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_extractCode.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'gender exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_gender.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'tissue exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_tissue.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'analyte exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_analyte.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'integrityNumber exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_integrityNumber.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'condition exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_condition.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'fileName exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_fileName.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'seqDevice exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_seqDevice.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'this should NOT throw an exception'() {
        when:
        schema.validate(new JSONObject(new File("./valid_example.json").text)) // throws a ValidationException if this object is invalid
        
        then:
        assert schema
    }
}






