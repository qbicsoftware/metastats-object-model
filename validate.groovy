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

    def 'a malformatted preparation sample id should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_prepSampleId.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted sequencing facility id  should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_seqFacilityId.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted sample name id should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_sampleName.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted entity sample id should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_sampleGroup.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted species specification should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_species.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted extract sample id should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_extractCode.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted sex specification should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_sex.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted tissue specification should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_tissue.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted analyte type  should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_analyte.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted RIN/DIN should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_integrityNumber.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted sample id  should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_condition.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted filename should throw a validation exception'() {
        when:
        schema.validate(new JSONObject(new File("./invalid_fileName.json").text)) // throws a ValidationException if this object is invalid

        then:
        org.everit.json.schema.ValidationException exception = thrown(org.everit.json.schema.ValidationException)
    }

    def 'a malformatted specification of the sequencing device should throw a validation exception'() {
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






