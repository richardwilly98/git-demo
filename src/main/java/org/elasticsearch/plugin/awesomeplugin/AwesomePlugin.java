package org.elasticsearch.plugin.awesomeplugin;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.plugins.AbstractPlugin;

/**
 * @author richardwilly98 (Richard Louapre)
 */

public class AwesomePlugin extends AbstractPlugin {

    @Inject public AwesomePlugin() {
    }

    @Override public String name() {
        return "river-awesomeplugin";
    }

    @Override public String description() {
        return "River Awesome Plugin";
    }
}