(defproject wsrepl "0.1.0-SNAPSHOT"
  :description    "Web Service CLJS REPL"
  :license {
      :name "Eclipse Public License"
      :url  "http://www.eclipse.org/legal/epl-v10.html"
  }
 
  :min-lein-version "2.0.0" 

  :dependencies [
  	[org.clojure/clojure "1.5.1"]
    [org.clojure/clojurescript "0.0-2156"]
  	[compojure "1.1.6"]
  	[http-kit "2.1.12"]
  	[javax.servlet/javax.servlet-api "3.1.0"]
  	[org.clojure/data.json "0.2.4"]]


  :source-paths ["src/clj"]

)