package com.olvind.tso
package importer

import com.olvind.tso.ts.TsIdentLibrary

object Libraries {

  /**
    * A good combination of interesting libraries, and libraries that are needed by libs in DT.
    */
  val extraExternals: Set[TsIdentLibrary] = awsSdk ++ expo ++ Set(
    "react-phone-number-input",
    "libphonenumber-js",
    "ant-design-pro",
    "activex-helpers",
    "ajv-keywords",
    "androiduix",
    "@angular/animations",
    "@angular/common",
    "@angular/compiler",
    "@angular/core",
    "@angular/forms",
    "@angular/http",
    "@angular/platform-browser",
    "@angular/platform-browser-dynamic",
    "@angular/router",
    "@ant-design/icons",
    "@ant-design/icons-react",
    "@ant-design/colors",
    "@ant-design/react-native",
    "@ant-design/icons-vue",
    "@ant-design/icons-angular",
    "@ant-design/icons-react-native",
    "@ant-design/dark-theme",
    "@ant-design/pro-layout",
    "antd-mobile",
    "antd-mobile-rn",
    "api-service",
    "apollo-client",
    "apollo-link-http-common",
    "apollo-react",
    "apollo-server",
    "@asymmetrik/leaflet-d3",
    "authmosphere",
    "auto-loader",
    "ava",
    "@babel/runtime",
    "@babel/types",
    "blake2s-js",
    "@blueprintjs/core",
    "@blueprintjs/datetime",
    "@blueprintjs/icons",
    "@blueprintjs/select",
    "@blueprintjs/table",
    "@blueprintjs/timezone",
    "browserfs",
    "csw-aas-js",
    "downshift",
    "dva",
    "@elastic/elasticsearch",
    "emotion",
    "emotion-theming",
    "express-frappe",
    "firebase",
    "firebase-admin",
    "formik",
    "formstate",
    "formsy-react",
    "@fortawesome/fontawesome-svg-core",
    "@fortawesome/free-solid-svg-icons",
    "@fortawesome/react-fontawesome",
    "fullcalendar",
    "gatsby",
    "gatsby-image",
    "gestalt",
    "graphql-tools",
    "grommet",
    "@grpc/proto-loader",
    "highcharts",
    "highcharts-react-official",
    "@hyperloris/tyson",
    "indefinite-observable",
    "instagram-private-api",
    "ionic",
    "@ionic/angular",
    "@ionic/react",
    "@ionic/core",
    "@ionic/storage",
    "io-ts",
    "jcore-react-native",
    "js-joda",
    "@jupyterlab/metapackage",
    "@material-ui/core",
    "@material-ui/icons",
    "@material-ui/lab",
    "meteor-typings",
    "@microsoft/load-themed-styles",
    "@mindbox/redux-helpers",
    "minecraft-scripting-types-client",
    "minecraft-scripting-types-server",
    "mobx-react",
    "mobx-react-devtools",
    "mobx-remotedev",
    "monaco-editor",
    "monocle-ts",
    "@mysticatea/spy",
    "ngx-infinite-scroll",
    "@nivo/axes",
    "@nivo/bar",
    "@nivo/bullet",
    "@nivo/calendar",
    "@nivo/chord",
    "@nivo/circle-packing",
    "@nivo/core",
    "@nivo/generators",
    "@nivo/geo",
    "@nivo/heatmap",
    "@nivo/legends",
    "@nivo/line",
    "@nivo/parallel-coordinates",
    "@nivo/pie",
    "@nivo/radar",
    "@nivo/sankey",
    "@nivo/scales",
    "@nivo/scatterplot",
    "@nivo/stream",
    "@nivo/sunburst",
    "@nivo/treemap",
    "@nivo/voronoi",
    "@nivo/waffle",
    "objection",
    "@octokit/rest",
    "office-ui-fabric-react",
    "onsenui",
    "openapi-types",
    "opentracing",
    "parchment",
    "phaser",
    "@phc/format",
    "@phenomnomnominal/tsquery",
    "pinata-sdk",
    "popmotion-pose",
    "popmotion",
    "preact",
    "primereact",
    "prisma-binding",
    "@protobufjs/aspromise",
    "@protobufjs/codegen",
    "@pulumi/aws",
    "@pulumi/cloud",
    "@pulumi/kubernetes",
    "@pulumi/pulumi",
    "rbx",
    "rc-swipeout",
    "react-ace",
    "react-apollo",
    "react-aria-modal",
    "react-async",
    "react-avatar-editor",
    "react-bulma-components",
    "react-date-range",
    "react-draggable-list",
    "react-emotion",
    "react-fns",
    "react-helmet",
    "react-instantsearch",
    "react-json-view",
    "react-latex-next",
    "react-live",
    "react-localization",
    "react-markdown",
    "react-md",
    "react-mosaic-component",
    "react-native-firebase",
    "@react-native-firebase/app",
    "react-native-gesture-handler",
    "react-native-svg",
    "react-navigation-drawer",
    "react-navigation-stack",
    "react-player",
    "react-popper",
    "react-pose",
    "react-spinners",
    "react-svg",
    "react-testing-library",
    "react-themeable-ts",
    "react-toggled",
    "react-toolbox",
    "react-tools",
    "react-waypoint",
    "react-widgets",
    "react-window",
    "reapop",
    "rebass",
    "redbox-react",
    "redux-observable",
    "re-reselect",
    "reselect",
    "rmc-calendar",
    "rmc-date-picker",
    "rmc-picker",
    "rollup-typescript",
    "rxjs",
    "rxjs-compat",
    "semantic-ui-form",
    "semantic-ui-react",
    "signals.js",
    "snabbdom",
    "sodiumjs",
    "source-map-support",
    "storm-react-diagrams",
    "styled-components",
    "superagent-proxy",
    "sw-toolbox",
    "tensorflow",
    "@tensorflow/tfjs-node",
    "@tensorflow/tfjs",
    "tensorscript",
    "tslint",
    "ts-mockito",
    "twilio-chat",
    "typed-github-api",
    "typed-graphql",
    "typedoc",
    "typed-rest-client",
    "typed-undo",
    "typesafe-actions",
    "typescript-optional",
    "typestub-ipfs",
    "@uifabric/merge-styles",
    "@uifabric/styling",
    "@uirouter/angularjs",
    "vscode-languageclient",
    "vscode-languageserver",
    "vscode-languageserver-types",
    "vue-class-component",
    "vue-cli",
    "vue-loader",
    "vue-router",
    "vue-rx",
    "vue-server-renderer",
    "vuex",
    "@welldone-software/why-did-you-render",
    "what-input",
    "xstream",
    "zipkin",
  ).map(TsIdentLibrary.apply)

  def ignored(sequential: Boolean): Set[TsIdentLibrary] = {
    val base = Set[String](
      "graphene-pk11",
      "rvo2",
      "yfiles",
      "chromecast-caf-receiver",
      "snoowrap",
      // bundles junk files
      "bottleneck",
      // these are referenced in notNeededPackages.json but don't exist
      "@sindresorhus/djb2a",
      "navigator-permissions",
      "webassembly-js-api",
      "w3c-permissions",
      // circular, and somehow breaks sequential mode?
      "koa-compose",
      // not installable on linux
      "fsevents",
    )

    // some new kind of circular dependency causes the phase runner to wait forever (parallel mode)
    def circular =
      if (sequential) Set()
      else
        Set(
          "mali",
          "apollo-tracing",
          "playerframework",
          "gatsby",
          "socketcluster",
          "egg",
        )

    def slow = Set("@pulumi/aws", "aws-sdk", "googleapis")

    base ++ circular ++ slow map TsIdentLibrary.apply
  }

  /* These are all the libraries used in demos. The set doubles as the extended test set */
  val DemoSet: Set[TsIdentLibrary] = expo ++ Set(
    "@fortawesome/fontawesome-svg-core",
    "@fortawesome/free-solid-svg-icons",
    "@fortawesome/react-fontawesome",
    "@material-ui/core",
    "@material-ui/icons",
    "angular__common",
    "angular__compiler",
    "angular__core",
    "angular__forms",
    "angular__platform-browser",
    "angular__platform-browser-dynamic",
    "angular__router",
    "antd",
    "antd-slinky-facade",
    "axios",
    "body-parser",
    "chart.js",
    "classnames",
    "connect",
    "core-js",
    "csstype",
    "d3",
    "d3-array",
    "d3-axis",
    "d3-brush",
    "d3-chord",
    "d3-collection",
    "d3-color",
    "d3-contour",
    "d3-dispatch",
    "d3-drag",
    "d3-dsv",
    "d3-ease",
    "d3-fetch",
    "d3-force",
    "d3-format",
    "d3-geo",
    "d3-hierarchy",
    "d3-interpolate",
    "d3-path",
    "d3-polygon",
    "d3-quadtree",
    "d3-random",
    "d3-scale",
    "d3-scale-chromatic",
    "d3-selection",
    "d3-shape",
    "d3-time",
    "d3-time-format",
    "d3-timer",
    "d3-transition",
    "d3-voronoi",
    "d3-zoom",
    "electron",
    "exenv",
    "express",
    "express-serve-static-core",
    "extract-zip",
    "geojson",
    "googlemaps",
    "highlight.js",
    "hoist-non-react-statics",
    "ipfs-http-client",
    "is-buffer",
    "jquery",
    "jqueryui",
    "leaflet",
    "lodash",
    "material-ui",
    "mime",
    "mobx",
    "mobx-react",
    "moment",
    "node",
    "onsenui",
    "p5",
    "prop-types",
    "range-parser",
    "react",
    "react-addons-linked-state-mixin",
    "react-big-calendar",
    "react-dom",
    "react-facade",
    "react-is",
    "react-japgolly-facade",
    "react-lifecycles-compat",
    "react-native",
    "react-native-gesture-handler",
    "react-native-vector-icons",
    "react-navigation",
    "react-navigation-drawer",
    "react-navigation-stack",
    "react-redux",
    "react-redux-facade",
    "react-router-dom",
    "react-router-dom-slinky-facade",
    "react-router-native",
    "react-slick",
    "react-slinky-facade",
    "redux",
    "redux-devtools-extension",
    "reveal",
    "rxjs",
    "semantic-ui-react",
    "semantic-ui-react__event-stack",
    "serve-static",
    "shallowequal",
    "sizzle",
    "std",
    "std-facade",
    "storybook__react",
    "styled-components",
    "symbol-observable",
    "three",
    "tslib",
    "typescript",
    "vue",
    "webpack-env",
    "yandex-maps",
    "zone.js",
  ).map(TsIdentLibrary.apply)

  def expo: Set[TsIdentLibrary] =
    Set(
      "@expo/vector-icons",
      "@expo/websql",
      "expo",
      "expo-app-loader-provider",
      "expo-asset",
      "expo-constants",
      "expo-file-system",
      "expo-font",
      "expo-keep-awake",
      "expo-linear-gradient",
      "expo-location",
      "expo-permissions",
      "expo-sqlite",
      "expo-web-browser",
    ).map(TsIdentLibrary.apply)

  def awsSdk: Set[TsIdentLibrary] =
    Set(
      "@aws-sdk/abort-controller",
      "@aws-sdk/add-glacier-checksum-headers-browser",
      "@aws-sdk/add-glacier-checksum-headers-node",
      "@aws-sdk/add-glacier-checksum-headers-universal",
      "@aws-sdk/apply-body-checksum-middleware",
      "@aws-sdk/bucket-endpoint-middleware",
      "@aws-sdk/build-types",
      "@aws-sdk/chunked-blob-reader",
      "@aws-sdk/chunked-stream-reader-node",
      "@aws-sdk/client-codecommit-node",
      "@aws-sdk/client-cognito-identity-browser",
      "@aws-sdk/client-dynamodb-browser",
      "@aws-sdk/client-dynamodb-node",
      "@aws-sdk/client-glacier-node",
      "@aws-sdk/client-kinesis-browser",
      "@aws-sdk/client-kms-browser",
      "@aws-sdk/client-kms-node",
      "@aws-sdk/client-lambda-node",
      "@aws-sdk/client-pinpoint-browser",
      "@aws-sdk/client-s3-browser",
      "@aws-sdk/client-s3-node",
      "@aws-sdk/client-sqs-node",
      "@aws-sdk/client-xray-node",
      "@aws-sdk/config-resolver",
      "@aws-sdk/core-handler",
      "@aws-sdk/credential-provider-cognito-identity",
      "@aws-sdk/credential-provider-env",
      "@aws-sdk/credential-provider-imds",
      "@aws-sdk/credential-provider-ini",
      "@aws-sdk/credential-provider-node",
      "@aws-sdk/credential-provider-process",
      "@aws-sdk/ec2-error-unmarshaller",
      "@aws-sdk/eventstream-marshaller",
      "@aws-sdk/fetch-http-handler",
      "@aws-sdk/hash-blob-browser",
      "@aws-sdk/hash-node",
      "@aws-sdk/hash-stream-node",
      "@aws-sdk/http-headers",
      "@aws-sdk/http-serialization",
      "@aws-sdk/is-array-buffer",
      "@aws-sdk/is-iterable",
      "@aws-sdk/is-node",
      "@aws-sdk/json-builder",
      "@aws-sdk/json-error-unmarshaller",
      "@aws-sdk/json-parser",
      "@aws-sdk/karma-credential-loader",
      "@aws-sdk/location-constraint-middleware",
      "@aws-sdk/logger",
      "@aws-sdk/md5-js",
      "@aws-sdk/md5-universal",
      "@aws-sdk/middleware-content-length",
      "@aws-sdk/middleware-ec2-copysnapshot",
      "@aws-sdk/middleware-expect-continue",
      "@aws-sdk/middleware-header-default",
      "@aws-sdk/middleware-input-default",
      "@aws-sdk/middleware-operation-logging",
      "@aws-sdk/middleware-rds-presignedurl",
      "@aws-sdk/middleware-sdk-api-gateway",
      "@aws-sdk/middleware-sdk-glacier",
      "@aws-sdk/middleware-serializer",
      "@aws-sdk/middleware-stack",
      "@aws-sdk/modeled-endpoint-middleware",
      "@aws-sdk/node-http-handler",
      "@aws-sdk/property-provider",
      "@aws-sdk/protocol-json-rpc",
      "@aws-sdk/protocol-query",
      "@aws-sdk/protocol-rest",
      "@aws-sdk/protocol-timestamp",
      "@aws-sdk/query-builder",
      "@aws-sdk/query-error-unmarshaller",
      "@aws-sdk/query-request-presigner",
      "@aws-sdk/querystring-builder",
      "@aws-sdk/querystring-parser",
      "@aws-sdk/region-provider",
      "@aws-sdk/remove-sensitive-logs",
      "@aws-sdk/response-metadata-extractor",
      "@aws-sdk/retry-middleware",
      "@aws-sdk/route53-id-normalizer-middleware",
      "@aws-sdk/s3-error-unmarshaller",
      "@aws-sdk/s3-request-presigner",
      "@aws-sdk/service-error-classification",
      "@aws-sdk/service-model",
      "@aws-sdk/sha256-tree-hash",
      "@aws-sdk/shared-ini-file-loader",
      "@aws-sdk/signature-v4-browser",
      "@aws-sdk/signature-v4-node",
      "@aws-sdk/signature-v4-universal",
      "@aws-sdk/signature-v4",
      "@aws-sdk/signing-middleware",
      "@aws-sdk/ssec-middleware",
      "@aws-sdk/stream-collector-browser",
      "@aws-sdk/stream-collector-node",
      "@aws-sdk/types",
      "@aws-sdk/url-parser-browser",
      "@aws-sdk/url-parser-node",
      "@aws-sdk/url-parser-universal",
      "@aws-sdk/util-base64-browser",
      "@aws-sdk/util-base64-node",
      "@aws-sdk/util-base64-universal",
      "@aws-sdk/util-body-length-browser",
      "@aws-sdk/util-body-length-node",
      "@aws-sdk/util-buffer-from",
      "@aws-sdk/util-create-request",
      "@aws-sdk/util-error-constructor",
      "@aws-sdk/util-format-url",
      "@aws-sdk/util-hex-encoding",
      "@aws-sdk/util-locate-window",
      "@aws-sdk/util-uri-escape",
      "@aws-sdk/util-user-agent-browser",
      "@aws-sdk/util-user-agent-node",
      "@aws-sdk/util-utf8-browser",
      "@aws-sdk/util-utf8-node",
      "@aws-sdk/util-utf8-universal",
      "@aws-sdk/xml-body-builder",
      "@aws-sdk/xml-body-parser",
      "@aws-sdk/xml-builder",
    ).map(TsIdentLibrary.apply)
}
