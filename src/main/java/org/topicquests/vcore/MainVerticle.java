package org.topicquests.vcore;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;
import io.vertx.sqlclient.SqlClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.topicquests.vcore.conig.Configurator;
import org.topicquests.vcore.db.PgDriver;

/**
 * @author jackpark
 * @license Apache2
 */
public class MainVerticle extends AbstractVerticle {
    private static final Logger LOG = LoggerFactory.getLogger(MainVerticle.class);
    private Configurator config;
    private JsonObject configProperties;
    private SqlClient db;

    @Override
    public void start(final Promise<Void> startPromise) throws Exception {
        LOG.debug("Starting");
        System.out.println("Starting");
        config = new Configurator(vertx);
        configProperties = config.getProperties();
        db = PgDriver.createPgPool(config, vertx);
        // Here is where other verticlss are created
    }
   // public static void main(String [] args) {

   // }
}
