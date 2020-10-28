package typings.awsSdk

import typings.awsSdk.documentClientMod.DocumentClient.ConverterOptions
import typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typings.awsSdk.dynamodbMod.AttributeValue
import typings.awsSdk.dynamodbMod.ClientConfiguration
import typings.awsSdk.servicesDynamodbMod.DynamoDBCustomizations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/all", JSImport.Namespace)
@js.native
object allMod extends js.Object {
  @js.native
  object DynamoDB extends js.Object {
    /* static members */
    @js.native
    object Converter extends js.Object {
      def input(data: js.Any): AttributeValue = js.native
      def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
    }
    
    @js.native
    class Converter ()
      extends typings.awsSdk.converterMod.Converter
    
    @js.native
    /**
      * Creates a DynamoDB document client with a set of configuration options.
      */
    class DocumentClient ()
      extends typings.awsSdk.documentClientMod.DocumentClient {
      def this(options: DocumentClientOptions with ClientConfiguration) = this()
    }
    
  }
  
  @js.native
  class DynamoDB () extends DynamoDBCustomizations {
    def this(options: ClientConfiguration) = this()
  }
  
}

