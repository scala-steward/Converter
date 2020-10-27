package typings.node

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/************************************************
*                                               *
*                   MODULES                     *
*                                               *
************************************************/
object bufferMod {
  
  @JSImport("buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("buffer", "INSPECT_MAX_BYTES")
  @js.native
  val INSPECT_MAX_BYTES: Double = js.native
  @scala.inline
  def INSPECT_MAX_BYTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSPECT_MAX_BYTES")(x.asInstanceOf[js.Any])
  @JSImport("buffer", "Buffer")
  @js.native
  class Buffer protected () extends NodeBuffer {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      */
    def this(arrayBuffer: ArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: js.Array[_]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      */
    def this(buffer: typings.node.Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      */
    def this(str: String) = this()
    def this(str: String, encoding: String) = this()
  }
  
  object Buffer {
    
    /**
      * Allocates a new Buffer using an {array} of octets.
      */
    @JSImport("buffer", "Buffer.from")
    @js.native
    def from(array: js.Array[_]): typings.node.Buffer = js.native
  }
  
  @JSImport("buffer", "SlowBuffer")
  @js.native
  class SlowBuffer protected () extends NodeBuffer {
    def this(array: js.Array[_]) = this()
    def this(size: Double) = this()
    def this(size: Uint8Array) = this()
    def this(str: String) = this()
    def this(str: String, encoding: String) = this()
  }
  
  object SlowBuffer {
    
    @JSImport("buffer", "SlowBuffer.byteLength")
    @js.native
    def byteLength(string: String): Double = js.native
    
    @JSImport("buffer", "SlowBuffer.byteLength")
    @js.native
    def byteLength(string: String, encoding: String): Double = js.native
    
    @JSImport("buffer", "SlowBuffer.concat")
    @js.native
    def concat(list: js.Array[typings.node.Buffer]): typings.node.Buffer = js.native
    
    @JSImport("buffer", "SlowBuffer.concat")
    @js.native
    def concat(list: js.Array[typings.node.Buffer], totalLength: Double): typings.node.Buffer = js.native
    
    @JSImport("buffer", "SlowBuffer.isBuffer")
    @js.native
    def isBuffer(obj: js.Any): Boolean = js.native
  }
  
}

