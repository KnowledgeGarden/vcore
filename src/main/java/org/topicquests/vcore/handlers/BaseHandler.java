package org.topicquests.vcore.handlers;

import io.vertx.core.Vertx;
import io.vertx.sqlclient.SqlClient;

/**
 * Database Handlers can extend this class for convenience
 * @author jackpark
 * @license Apache2
 */
public class BaseHandler {
    protected final SqlClient db;

    /**
     *
     * @param db
     * @param vertx here in case it's needed for template engines
     */
    public BaseHandler(final SqlClient db, Vertx vertx) {
        this.db = db;
    }
}
